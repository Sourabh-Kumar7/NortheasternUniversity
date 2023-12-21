/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.NGOInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.NGO.NGOClass;
import finalprojectUserInterface.MainJFrameForm;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author sourabh
 */
public class NGOAdminSignUp extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminSignUp
     */
    
    boolean ValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    public NGOAdminSignUp(MainJFrameForm MainLPage, DB4OUtility operatingSystem, OperatingSystem dB4OUtility) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = operatingSystem;
        this.operatingSystem = dB4OUtility;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ngoadmin_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        unmae_lbl = new javax.swing.JLabel();
        pswd_lbl = new javax.swing.JLabel();
        reg_lbl = new javax.swing.JLabel();
        reg_txt = new javax.swing.JTextField();
        pswd_txt = new javax.swing.JPasswordField();
        uname_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        addr_lbl = new javax.swing.JLabel();
        city_txt = new javax.swing.JLabel();
        state_lbl = new javax.swing.JLabel();
        zipcode_lbl = new javax.swing.JLabel();
        zip_txt = new javax.swing.JTextField();
        state_txt = new javax.swing.JTextField();
        cityname_txt = new javax.swing.JTextField();
        addr_txt = new javax.swing.JTextField();
        signup_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(198, 220, 212));

        ngoadmin_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ngoadmin_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ngoadmin_lbl.setText("Create Admin Profile");

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_lbl.setText("Name:");

        unmae_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unmae_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unmae_lbl.setText("Username:");

        pswd_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswd_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pswd_lbl.setText("Password:");

        reg_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reg_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reg_lbl.setText("Registered No.:");

        addr_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addr_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addr_lbl.setText("Address:");

        city_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        city_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        city_txt.setText("City:");

        state_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        state_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        state_lbl.setText("State:");

        zipcode_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zipcode_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zipcode_lbl.setText("Zip Code:");

        signup_btn.setBackground(new java.awt.Color(255, 204, 51));
        signup_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signup_btn.setText("Sign Up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(255, 204, 51));
        back_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reg_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswd_lbl)
                            .addComponent(unmae_lbl)
                            .addComponent(name_lbl))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addr_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addr_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(city_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(state_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipcode_lbl)
                                .addGap(47, 47, 47)
                                .addComponent(zip_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ngoadmin_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295)))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addr_lbl, city_txt, name_lbl, pswd_lbl, reg_lbl, state_lbl, unmae_lbl, zipcode_lbl});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addr_txt, cityname_txt, name_txt, pswd_txt, reg_txt, state_txt, uname_txt, zip_txt});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back_btn, signup_btn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(ngoadmin_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addr_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addr_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_txt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(state_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zip_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipcode_lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unmae_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pswd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswd_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg_lbl))))
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn))
                .addGap(98, 98, 98))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addr_lbl, addr_txt, city_txt, cityname_txt, name_lbl, name_txt, pswd_lbl, pswd_txt, reg_lbl, reg_txt, state_lbl, state_txt, uname_txt, unmae_lbl, zip_txt, zipcode_lbl});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back_btn, signup_btn});

    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = addr_txt.getText() + ", " + cityname_txt.getText() + ", " + state_txt.getText() + ", " + zip_txt.getText();
                    NGOClass hosp = new NGOClass(address,  uname_txt.getText(),pswd_txt.getText(), name_txt.getText(), reg_txt.getText());
                    System.out.println("NGO"+hosp.getpName());

                    operatingSystem.addNGO(hosp);
                    for(NGOClass h: operatingSystem.getNGODirectory().getListOfNGO()){
                        System.out.println("ngo: "+ h.getNameEnterprise());
                    }
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);

                }
                else
                    {
                        JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                        validationCheck=true;
                    }
            }
            else{
                    JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                    ValidationStatus=true;
                }
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(this,"Receiver not registered, Try again");
             ValidationStatus=true;
        }
        
        
       
    }//GEN-LAST:event_signup_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);

    }//GEN-LAST:event_back_btnActionPerformed

    
    
    private boolean RegexValidation() {
    if(!name_txt.getText().matches("^[a-zA-Z ]+$"))
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name_txt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(!reg_txt.getText().matches("^[0-9]{10}$"))
        {
            reg_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            reg_txt.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }


        if(!zip_txt.getText().matches("^[0-9]{5}$"))
        {
            zip_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            zip_txt.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }
        return validationCheck;
    }   


    private boolean EmpytyFieldValidation() {
        if(addr_txt.getText().equals(null) || addr_txt.getText().trim().isEmpty() )
        {
            addr_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            addr_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!addr_txt.getText().equals(null) && !addr_txt.getText().trim().isEmpty() )
        {
            addr_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(cityname_txt.getText().equals(null) || cityname_txt.getText().trim().isEmpty() )
        {
            cityname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            cityname_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!cityname_txt.getText().equals(null) && !cityname_txt.getText().trim().isEmpty() )
        {
            cityname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(name_txt.getText().equals(null) || name_txt.getText().trim().isEmpty() )
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!name_txt.getText().equals(null) && !name_txt.getText().trim().isEmpty() )
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(pswd_txt.getText().equals(null) || pswd_txt.getText().trim().isEmpty() )
        {
            pswd_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            pswd_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!pswd_txt.getText().equals(null) && !pswd_txt.getText().trim().isEmpty() )
        {
            pswd_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(state_txt.getText().equals(null) || state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            state_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!state_txt.getText().equals(null) && !state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(uname_txt.getText().equals(null) || uname_txt.getText().trim().isEmpty() )
            {
                uname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                uname_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!uname_txt.getText().equals(null) && !uname_txt.getText().trim().isEmpty() )
        {
            uname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(zip_txt.getText().equals(null) || zip_txt.getText().trim().isEmpty() )
            {
                zip_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                zip_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!zip_txt.getText().equals(null) && !zip_txt.getText().trim().isEmpty() )
        {
            zip_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(reg_txt.getText().equals(null) || reg_txt.getText().trim().isEmpty() )
            {
                reg_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                reg_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!reg_txt.getText().equals(null) && !reg_txt.getText().trim().isEmpty() )
        {
            reg_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        

        return ValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addr_lbl;
    private javax.swing.JTextField addr_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel city_txt;
    private javax.swing.JTextField cityname_txt;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel ngoadmin_lbl;
    private javax.swing.JLabel pswd_lbl;
    private javax.swing.JPasswordField pswd_txt;
    private javax.swing.JLabel reg_lbl;
    private javax.swing.JTextField reg_txt;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JTextField state_txt;
    private javax.swing.JTextField uname_txt;
    private javax.swing.JLabel unmae_lbl;
    private javax.swing.JTextField zip_txt;
    private javax.swing.JLabel zipcode_lbl;
    // End of variables declaration//GEN-END:variables
}
