/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.BusinessOwner;

import DataManagement.DataManager;
import static DataManagement.DataManager.masterOrderList;
import static DataManagement.DataManager.personDirectory;
import static DataManagement.DataManager.salesPersonDirectory;
import OrderManagement.Order;
import TheBusiness.Personnel.SalesPerson;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author mac
 */
public class ManageSalesBusinessOwnerJFrame extends javax.swing.JFrame {

    
    javax.swing.JFrame parentFrame;
    /**
     * Creates new form ManageSalesBusinessOwnerJFrame
     * @param parentFrame
     */
    public ManageSalesBusinessOwnerJFrame(javax.swing.JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        refreshTable();
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

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageSalesPeople = new javax.swing.JTable();
        btnMetrics = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Sales");

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblManageSalesPeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sales Person Name", "Total Profit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageSalesPeople);

        btnMetrics.setText("Metrics");
        btnMetrics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetricsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMetrics)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnMetrics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        loadParentFrame();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMetricsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetricsActionPerformed
        // TODO add your handling code here:
        // Create a dataset for the top 5 salespeople based on total profit
        CategoryDataset topSalespeopleDataset = createTopSalespeopleDataset();
        // Display the graph in a new frame
        new TopSalespeopleChartFrame(topSalespeopleDataset);
    }//GEN-LAST:event_btnMetricsActionPerformed

    /**
     * @param args the command line arguments
     */
    private void loadParentFrame() {
        Point myPosition = getLocation();
        this.parentFrame.setLocation(myPosition);
        this.parentFrame.setVisible(true);
        this.dispose();
    }
    
    private CategoryDataset createTopSalespeopleDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Map<SalesPerson, Double> salespersonProfitMap = new HashMap<>();

        DataManager.salesPersonDirectory.values().forEach(salesPerson -> {
            int salesPersonId = salesPerson.getPersonId();
            double totalProfitLoss = calculateTotalProfitLoss(salesPersonId);
            salespersonProfitMap.put(salesPerson, totalProfitLoss);
        });

        // Sort the salespeople based on total profit/loss in descending order
        List<Map.Entry<SalesPerson, Double>> sortedSalespeople = salespersonProfitMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        // Select the top 5 salespeople
        List<Map.Entry<SalesPerson, Double>> topSalespeople = sortedSalespeople.stream().limit(5).collect(Collectors.toList());

        for (Map.Entry<SalesPerson, Double> entry : topSalespeople) {
            SalesPerson salesPerson = entry.getKey();
            int salesPersonId = salesPerson.getPersonId();
            double totalProfitLoss = entry.getValue();

            dataset.addValue(totalProfitLoss, "Total Profit", String.valueOf(salesPersonId));
        }

        return dataset;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMetrics;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblManageSalesPeople;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
    
        DefaultTableModel model = (DefaultTableModel) tblManageSalesPeople.getModel();
          Map<Integer, Double> salesPersonsMap = new HashMap<>();    //To store ids of most profitable salespersons
        
        for (SalesPerson salesPerson : salesPersonDirectory.values()) {
            int salesPersonId = salesPerson.getPersonId();
            double totalProfitLoss = calculateTotalProfitLoss(salesPersonId);    //calculate totalprofitloss per salesperson
            salesPersonsMap.put(salesPerson.getPersonId(),totalProfitLoss);  //put it into new hashmap
            
            }
        
            List<Map.Entry<Integer, Double>> sortedEntries = new ArrayList<>(salesPersonsMap.entrySet());
            Collections.sort(sortedEntries, Collections.reverseOrder(Comparator.comparingDouble(Map.Entry::getValue))); //sort hashmap by descending order of total profit
            // Create a new HashMap to store the sorted entries
            Map<Integer, Double> sortedSalesPersonsMap = new HashMap<>();
            for (Map.Entry<Integer, Double> entry : sortedEntries) {
                sortedSalesPersonsMap.put(entry.getKey(), entry.getValue());
        
            }
            
            //From sorted hashmap, we're getting the salespersonids and then printing the salespersondirectory 
            for (Map.Entry<Integer, Double> entry : sortedSalesPersonsMap.entrySet()) {      
                Integer salesPersonId = entry.getKey();
                Double totalProfitLoss = entry.getValue(); 
                SalesPerson salesPerson = salesPersonDirectory.get(salesPersonId);

                if (salesPerson != null) {
        // Access other attributes of SalesPerson as needed
                    int personId = salesPerson.getPersonId();
        // Add a row to the model with the salesperson detail
                    model.addRow(new Object[]{salesPerson.getPersonId(),personDirectory.get(salesPerson.getPersonId()).getName(),totalProfitLoss /* Other SalesPerson attributes */});
    
                }
            }
        }
 
    
    private static double calculateTotalProfitLoss(int salesPersonId) {
        double totalProfitLoss = 0.0;

        // Retrieve the SalesPerson
        SalesPerson salesPerson = salesPersonDirectory.get(salesPersonId);

        // Check if the SalesPerson is not null
        if (salesPerson != null) {
            // Iterate through completedOrderIds
            for (Integer orderId : salesPerson.getCompletedOrderIds()) {
                // Retrieve the Order from masterOrderList
                System.out.println("Order ID: " + orderId);
                Order order = masterOrderList.get(orderId);
                // Check if the Order is not null and is marked as "Done"
                if (order != null && "Done".equals(order.getOrderStatus())) {
                    // Calculate profit or loss and add to the total
                    double orderProfitLoss = order.calculateProfitLoss();
                    totalProfitLoss += orderProfitLoss;

                    // Add print statement for debugging
                    System.out.println("Order ID: " + orderId + ", SalesPerson ID: " + salesPersonId +
                            ", Profit/Loss for Order: " + orderProfitLoss + ", Total Profit/Loss: " + totalProfitLoss);
                }
            }
        }

        return Math.round(totalProfitLoss * 100.0) / 100.0;
    }

    
    
}

