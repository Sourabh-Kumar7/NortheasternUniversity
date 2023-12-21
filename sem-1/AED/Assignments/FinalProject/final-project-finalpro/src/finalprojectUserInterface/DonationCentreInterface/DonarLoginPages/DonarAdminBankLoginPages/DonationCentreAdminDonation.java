/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.DonationCentreInterface.DonarLoginPages.DonarAdminBankLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonationCentre.BankDonor;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectUserInterface.MainJFrameForm;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sourabh
 */
public class DonationCentreAdminDonation extends javax.swing.JPanel {

    /**
     * Creates new form DonationCentreAdminDonation
     */
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    BankDonor donorBank;
    
    public DonationCentreAdminDonation(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, BankDonor donbank) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.donorBank = donbank;
        populateTable(donbank.getNameEnterprise().toLowerCase());
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
        table_1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(169, 146, 125));

        table_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Category", "Item name", "Status", "Donor Enterprise", "Receiver Enterprise", "Receiver Name", "Donar name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
     private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (AssignmentDonation d : operatingSystem.getAssignmentDonationList()) {

            if (d.getDonEnterpriseClass().getNameEnterprise().toLowerCase().equals(name)) {
                Object[] row = new Object[8];
                row[0] = d.getItem();
                row[1] = d.getCategory();
                row[2] = d.getEntityName();
                row[3] = d.getStatusDonation();
                try {
                    row[4] = d.getDonEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecRecepient().getpName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonRecepient().getpName();
                } catch (Exception e) {

                }

                model.addRow(row);
            }
            try {
                if (d.getRecEnterpriseClass().getNameEnterprise().toLowerCase().equals(name)) {
                    Object[] row = new Object[8];
                    row[0] = d.getItem();
                    row[1] = d.getCategory();
                    row[2] = d.getEntityName();
                    row[3] = d.getStatusDonation();
                    try {
                        row[4] = d.getDonEnterpriseClass().getNameEnterprise();
                    } catch (Exception e) {

                    }

                    try {
                        row[5] = d.getRecEnterpriseClass().getNameEnterprise();
                    } catch (Exception e) {

                    }
                    try {
                        row[6] = d.getRecRecepient().getpName();
                    } catch (Exception e) {

                    }
                    try {
                        row[7] = d.getDonRecepient().getpName();
                    } catch (Exception e) {

                    }

                    model.addRow(row);
                }
            } catch (Exception e) {

            }

        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_1;
    // End of variables declaration//GEN-END:variables
}