/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.NGOInterface.LoginPage.NGOAdminLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.NGO.NGOClass;
import finalprojectBackend.Enterprise.NGO.Manager;
import finalprojectBackend.Enterprise.NGO.Recepient;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectBackend.Enterprise.NGO.Caretaker;
import finalprojectUserInterface.MainJFrameForm;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author sourabh
 */
public class AdminPageforItemDonation extends javax.swing.JPanel {

    /**
     * Creates new form AdminPageforItemDonation
     */
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    NGOClass ngo;

    public AdminPageforItemDonation(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, NGOClass h) {
        initComponents();
        System.out.println("AdminDonateItem() init");
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.ngo = h;
        
        for (Manager d : operatingSystem.getManagerDirectory()) {

            if (d.getNGOName().equals(ngo.getNameEnterprise())) {
                manager_cmb.addItem(d.getpName());
            }

        }
        
        for(Recepient pa : operatingSystem.getRecepientDirectory() ){
            if( pa.getNGOName().equals(ngo.getNameEnterprise())){
                donar_txt.addItem(pa.getpName());
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

        temTiitle_lbl = new javax.swing.JLabel();
        addentity_btn = new javax.swing.JButton();
        manager_cmb = new javax.swing.JComboBox<>();
        manager_lbl = new javax.swing.JLabel();
        donar_lbl = new javax.swing.JLabel();
        type_lbl = new javax.swing.JLabel();
        cat_lbl = new javax.swing.JLabel();
        itemname_lbl = new javax.swing.JLabel();
        item_txt = new javax.swing.JTextField();
        cat_txt = new javax.swing.JTextField();
        type_txt = new javax.swing.JTextField();
        donar_txt = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(150, 187, 193));

        temTiitle_lbl.setBackground(new java.awt.Color(255, 255, 255));
        temTiitle_lbl.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        temTiitle_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temTiitle_lbl.setText("Addition to NGO Donation");

        addentity_btn.setBackground(new java.awt.Color(255, 204, 51));
        addentity_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addentity_btn.setText("Add Donation Entity");
        addentity_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addentity_btnActionPerformed(evt);
            }
        });

        manager_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        manager_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_cmbActionPerformed(evt);
            }
        });

        manager_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manager_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manager_lbl.setText("Manager:");

        donar_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        donar_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donar_lbl.setText("Donor:");

        type_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type_lbl.setText("Type:");

        cat_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cat_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat_lbl.setText("Category:");

        itemname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itemname_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemname_lbl.setText("Item Name:");

        donar_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addentity_btn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(itemname_lbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cat_lbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(type_lbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(donar_lbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(manager_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addComponent(manager_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(temTiitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cat_txt, donar_txt, item_txt, manager_cmb, type_txt});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cat_lbl, donar_lbl, itemname_lbl, manager_lbl, type_lbl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(temTiitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manager_lbl)
                    .addComponent(manager_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donar_lbl)
                    .addComponent(donar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_lbl)
                    .addComponent(type_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat_lbl)
                    .addComponent(cat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemname_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addentity_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cat_lbl, cat_txt, donar_lbl, donar_txt, item_txt, itemname_lbl, manager_cmb, manager_lbl, type_lbl, type_txt});

    }// </editor-fold>//GEN-END:initComponents

    private void addentity_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addentity_btnActionPerformed
        // TODO add your handling code here:

        AssignmentDonation de = new AssignmentDonation();
        de.setEntityName(item_txt.getText().toString());
        Random rand = new Random();
        de.setUserId( String.format("%04d", rand.nextInt(10000)));
        de.setDonEnterpriseClass(ngo);
        de.setCategory(cat_txt.getText().toString());
        de.setItem(type_txt.getText().toString());
        de.setDonManager(operatingSystem.getManagerByUserName(manager_cmb.getSelectedItem().toString()));
        de.setDonRecepient(operatingSystem.getReceiverByUserName(donar_txt.getSelectedItem().toString()));
        de.setStatusDonation("available");
        //        System.out.println("dede: "+de.getDonorDoctor().getName());
        operatingSystem.addDonationAssignment(de);

        dB4OUtility.storeSystem(operatingSystem);
        JOptionPane.showMessageDialog(this, "Entity added!");

    }//GEN-LAST:event_addentity_btnActionPerformed

    private void manager_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_cmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manager_cmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addentity_btn;
    private javax.swing.JLabel cat_lbl;
    private javax.swing.JTextField cat_txt;
    private javax.swing.JLabel donar_lbl;
    private javax.swing.JComboBox<String> donar_txt;
    private javax.swing.JTextField item_txt;
    private javax.swing.JLabel itemname_lbl;
    private javax.swing.JComboBox<String> manager_cmb;
    private javax.swing.JLabel manager_lbl;
    private javax.swing.JLabel temTiitle_lbl;
    private javax.swing.JLabel type_lbl;
    private javax.swing.JTextField type_txt;
    // End of variables declaration//GEN-END:variables
}