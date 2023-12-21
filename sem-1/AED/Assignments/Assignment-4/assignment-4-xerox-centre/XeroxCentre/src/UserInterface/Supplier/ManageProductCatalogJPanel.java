/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Supplier;

import DataManagement.DataManager;
import ProductManagement.Product;
import TheBusiness.Personnel.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

    
    JPanel workArea;
    /**
     * Creates new form ManageProductCatalogJPanel
     */

    Supplier supplier;
    ManageProductCatalogJPanel(JPanel workArea, Supplier supplier) {
        this.supplier = supplier;
        initComponents();
        this.workArea=workArea;
        loadProductData();
        Color lightBlue = new Color(173, 216, 230);
        setBackground(lightBlue);  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnView = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();

        btnView.setText("View Product Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText(" Product Catalog");

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProduct))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch))
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, txtProductID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearch, jLabel1, txtProductID});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // Get the selected row index
        int selectedRowIndex = tblProducts.getSelectedRow();

        // Check if a row is actually selected
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a product to view its details", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the product ID from the selected row
        int productId = (int) tblProducts.getValueAt(selectedRowIndex, 0);

        // Fetch the product from the product catalog using the product ID
        Product product = DataManager.productCatalog.get(productId);

        if (product == null) {
            JOptionPane.showMessageDialog(null, "Product details not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Navigate to the ViewProductDetailJPanel with the selected product's details
        ViewProductDetailJPanel panel = new ViewProductDetailJPanel(workArea, product);
        workArea.add("ViewProductDetailJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        CreateNewProductJPanel panel = new CreateNewProductJPanel(workArea, supplier);
        workArea.add("CreateNewProductJPanel",panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int productId;
        try {
            productId = Integer.parseInt(txtProductID.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid product ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Product product = DataManager.productCatalog.get(productId);
        if (product != null) {
            DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
            model.setRowCount(0); // Clear table

            Object[] row = new Object[4];
            row[0] = product.getProductId();
            row[1] = product.getName();
            row[2] = product.getTargetPrice();
            row[3] = product.getQuantity();
            model.addRow(row);
        } else {
            JOptionPane.showMessageDialog(null, "Product not found", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void loadProductData() {
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0); // Clear existing data

        for (Integer productId : supplier.getProductIds()) {
            Product product = DataManager.productCatalog.get(productId);
            if (product != null) {
                Object[] row = new Object[4];
                row[0] = product.getProductId();
                row[1] = product.getName();
                row[2] = product.getTargetPrice();
                row[3] = product.getQuantity();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtProductID;
    // End of variables declaration//GEN-END:variables
}
