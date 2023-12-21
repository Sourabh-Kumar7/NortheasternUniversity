/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.MarketManager;

import DataManagement.DataManager;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sourabhkumar
 */
public class AddMarketJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddMarketJFrame
     */
    javax.swing.JFrame parentFrame;
    public AddMarketJFrame(javax.swing.JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        loadChannelData();
        Color lightBlue = new Color(173, 216, 230);
        getContentPane().setBackground(lightBlue);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Set close operation
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                loadParentFrame();
            }
        });
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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddedChannelToMarket = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNotAddedChannelToMarket = new javax.swing.JTable();
        btnAddChannelToMarket = new javax.swing.JButton();
        btnRemoveChannelFromMarket = new javax.swing.JButton();
        txtMarketName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMarketDecription = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnCreateMarket = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Market");

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Description");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Remove Channel From Market");

        tblAddedChannelToMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Channel ID", "Channel Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddedChannelToMarket);

        tblNotAddedChannelToMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Channel ID", "Channel Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblNotAddedChannelToMarket);

        btnAddChannelToMarket.setText("Add");
        btnAddChannelToMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChannelToMarketActionPerformed(evt);
            }
        });

        btnRemoveChannelFromMarket.setText("Remove");
        btnRemoveChannelFromMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveChannelFromMarketActionPerformed(evt);
            }
        });

        txtMarketDecription.setColumns(20);
        txtMarketDecription.setRows(5);
        jScrollPane1.setViewportView(txtMarketDecription);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Channel to Market");

        btnCreateMarket.setText("Create");
        btnCreateMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMarketActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnAddChannelToMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarketName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnClear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCreateMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(btnRemoveChannelFromMarket)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, txtMarketName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnCreateMarket});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarketName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddChannelToMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveChannelFromMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel4, txtMarketName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnCreateMarket});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        loadParentFrame();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddChannelToMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChannelToMarketActionPerformed
        // TODO add your handling code here:
        // Get selected row from tblNotAddedChannelToMarket
        int selectedRow = tblNotAddedChannelToMarket.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel modelNotAdded = (DefaultTableModel) tblNotAddedChannelToMarket.getModel();
            DefaultTableModel modelAdded = (DefaultTableModel) tblAddedChannelToMarket.getModel();

            Object[] rowData = new Object[2];
            rowData[0] = modelNotAdded.getValueAt(selectedRow, 0); // Channel ID
            rowData[1] = modelNotAdded.getValueAt(selectedRow, 1); // Channel Name
            modelAdded.addRow(rowData);
            modelNotAdded.removeRow(selectedRow);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a channel to remove", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddChannelToMarketActionPerformed

    private void btnRemoveChannelFromMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveChannelFromMarketActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAddedChannelToMarket.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel modelAdded = (DefaultTableModel) tblAddedChannelToMarket.getModel();
            DefaultTableModel modelNotAdded = (DefaultTableModel) tblNotAddedChannelToMarket.getModel();

            Object[] rowData = new Object[2];
            rowData[0] = modelAdded.getValueAt(selectedRow, 0); // Channel ID
            rowData[1] = modelAdded.getValueAt(selectedRow, 1); // Channel Name
            modelNotAdded.addRow(rowData);
            modelAdded.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a channel to remove", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveChannelFromMarketActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtMarketName.setText("");
        txtMarketDecription.setText("");
        ((DefaultTableModel) tblAddedChannelToMarket.getModel()).setRowCount(0);
        ((DefaultTableModel) tblNotAddedChannelToMarket.getModel()).setRowCount(0);
        loadChannelData(); // Reload channels
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMarketActionPerformed
        // TODO add your handling code here:
        String marketName = txtMarketName.getText().trim();
        String marketDescription = txtMarketDecription.getText().trim();

        if (marketName.isEmpty() || marketDescription.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Market newMarket = new Market(marketName, marketDescription);

        // Add selected channels to the new market
        DefaultTableModel model = (DefaultTableModel) tblAddedChannelToMarket.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Integer channelId = (Integer) model.getValueAt(i, 0);
            // Assuming Channel object creation or retrieval logic here
            newMarket.addChannel(channelId);
        }

        DataManager.marketCatalog.put(newMarket.getId(), newMarket);

        // Assuming you have access to the market manager's ID here
        // int marketManagerId = ...;
        // DataManager.marketManagerDirectory.get(marketManagerId).addMarketId(newMarket.getId());

        JOptionPane.showMessageDialog(null, "Market created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        btnClearActionPerformed(null); // Clear the form after creation
    }//GEN-LAST:event_btnCreateMarketActionPerformed

    private void loadParentFrame() {
        Point myPosition = getLocation();
        this.parentFrame.setLocation(myPosition);
        this.parentFrame.setVisible(true);
        this.dispose();
    }
    
    private void loadChannelData() {
    DefaultTableModel model = (DefaultTableModel) tblNotAddedChannelToMarket.getModel();
    model.setRowCount(0); // Clear existing data

    for (Channel channel : DataManager.channelDirectory.values()) {
        Object[] row = new Object[2];
        row[0] = channel.getChannelId();
        row[1] = channel.getName();
        model.addRow(row);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddChannelToMarket;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateMarket;
    private javax.swing.JButton btnRemoveChannelFromMarket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAddedChannelToMarket;
    private javax.swing.JTable tblNotAddedChannelToMarket;
    private javax.swing.JTextArea txtMarketDecription;
    private javax.swing.JTextField txtMarketName;
    // End of variables declaration//GEN-END:variables
}