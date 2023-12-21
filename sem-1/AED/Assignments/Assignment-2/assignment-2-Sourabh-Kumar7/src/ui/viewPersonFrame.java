/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import model.CustomExceptions.InvalidDateOfBirthException;
import model.CustomExceptions.InvalidEmailException;
import model.CustomExceptions.InvalidNameException;
import model.CustomExceptions.InvalidPhoneNumberException;
import static model.DataManager.personMap;
import static model.DataManager.userByUsernameMap;
import static model.DataManager.userMap;
import model.Person;
import model.User;
import model.validationUtil;

/**
 *
 * @author sourabhkumar
 */
public class viewPersonFrame extends javax.swing.JFrame {

    /**
     * Creates new form viewPersonFrame
     */
    Person p;
    User mngUser;
    private Image selectedImage = null;

    public viewPersonFrame(Person P, User mngUser) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Set close operation
        p = P;
        this.mngUser = mngUser;
        initPersonView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();
        lblLastName = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        lblDOB = new javax.swing.JLabel();
        btnSelectPicture = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblPhone = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPID = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstName.setText("First Name");

        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastName.setText("Last Name");

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDOB.setText("DOB");

        btnSelectPicture.setText("Select Picture");
        btnSelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPictureActionPerformed(evt);
            }
        });

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender");

        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone No.");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person");

        txtPID.setEditable(false);
        jScrollPane1.setViewportView(txtPID);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NEU ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLastName)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPhone)
                                    .addComponent(lblDOB)
                                    .addComponent(lblGender)
                                    .addComponent(jLabel2))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtLastName)
                                    .addComponent(jDateChooserDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jComboBoxGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addComponent(btnSelectPicture))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSelectPicture, lblPicture});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxGender, jDateChooserDOB, txtEmail, txtFirstName, txtLastName, txtPhone});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, lblDOB, lblEmail, lblFirstName, lblGender, lblLastName, lblPhone});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectPicture)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addComponent(jLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSelectPicture, jComboBoxGender, jDateChooserDOB, jLabel2, lblDOB, lblEmail, lblFirstName, lblGender, lblLastName, lblPhone, txtEmail, txtFirstName, txtLastName, txtPhone});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            Date dob = jDateChooserDOB.getDate();
            String gender = jComboBoxGender.getSelectedItem().toString();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();

            validationUtil.validateName(firstName);
            validationUtil.validateName(lastName);
            validationUtil.validateDateOfBirth(dob);
            validationUtil.validateEmail(email);
            validationUtil.validatePhoneNumber(phone);

            // Update person data except ID
            p.setFirstName(firstName);
            p.setLastName(lastName);
            p.setDOB(dob);
            p.setGender(gender);
            p.setEmail(email);
            p.setPhoneNum(phone);
            
            if (selectedImage != null) {
                // Get the person's ID
                String personId = Integer.toString(p.getId());
                String imagePath = "images/" + personId + ".jpg";
                File imageFile = new File(imagePath);

                // Convert the selected image to a BufferedImage
                BufferedImage bufferedImage = new BufferedImage(selectedImage.getWidth(null),
                        selectedImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = bufferedImage.createGraphics();
                g2.drawImage(selectedImage, 0, 0, null);
                g2.dispose();

                try {
                    ImageIO.write(bufferedImage, "jpg", imageFile);
                    p.setPicPath(imagePath);
                } catch (IOException e) {
                    System.err.println("Failed to update person data. Error: " + e.getMessage());
                }
            }
            // Notify user about successful update
            JOptionPane.showMessageDialog(viewPersonFrame.this, "Person data updated successfully.");
        } catch (InvalidNameException | InvalidDateOfBirthException | InvalidEmailException
                | InvalidPhoneNumberException e) {
            // Handle validation errors by displaying an error message
            JOptionPane.showMessageDialog(viewPersonFrame.this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        // Check if the person has a user account
            int personId = p.getId();
            if (personId != mngUser.getPid()) { // Check if it's not the current user's data
                // Remove person data
                if(userMap.containsKey(personId)){
                    User usr = userMap.get(personId);
                    String usrName = usr.getUsername();
                    userByUsernameMap.remove(usrName);
                    userMap.remove(personId);
                }
                personMap.remove(personId);

                // Notify user about successful deletion
                JOptionPane.showMessageDialog(viewPersonFrame.this, "Person data deleted successfully.");
                // Close the frame
                dispose();
            } else {
                // Notify the user that they cannot delete their own data
                JOptionPane.showMessageDialog(viewPersonFrame.this, "You cannot delete your own data.");
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSelectPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPictureActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null); // Show the file chooser dialog
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Load and display the selected picture in the JLabel
            lblPicture.setPreferredSize(new Dimension(300, 300));
            try {
//                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                int labelWidth = 125;
                int labelHeight = 68;

                // Load and display the selected picture in the JLabel
                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                Image image = imageIcon.getImage();

                // Calculate the scaling factors to fit the image within the label size
                double scaleX = (double) labelWidth / image.getWidth(null);
                double scaleY = (double) labelHeight / image.getHeight(null);

                // Use the scaling factors to create a scaled image
                Image scaledImage = image.getScaledInstance((int) (image.getWidth(null) * scaleX), (int) (image.getHeight(null) * scaleY), Image.SCALE_SMOOTH);
//                person.setImage(scaledImage);
                // Create a new ImageIcon from the scaled image
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                lblPicture.setIcon(scaledImageIcon);
                lblPicture.revalidate();
                lblPicture.repaint();
                // Set the selectedImage to the scaledImage
                selectedImage = scaledImage;
            } catch (Exception ex) {
                ex.printStackTrace();
                // Handle the exception, e.g., display an error message
            }
        }
    }//GEN-LAST:event_btnSelectPictureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSelectPicture;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextPane txtPID;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    private void initPersonView() {
        txtPID.setText(Integer.toString(p.getId()));
        txtFirstName.setText(p.getFirstName());
        txtLastName.setText(p.getLastName());
        jDateChooserDOB.setDate(p.getDOB());
        jComboBoxGender.setSelectedItem(p.getGender());
        txtEmail.setText(p.getEmail());
        txtPhone.setText(p.getPhoneNum());
        
        // Check if the person has a user account
        boolean userStatus = userMap.containsKey(p.getId());
        boolean adminStatus = false;

        if (userStatus) {
            User usr = userMap.get(p.getId());
            adminStatus = usr.isAdmin();
        }

        Border border = BorderFactory.createLineBorder(Color.BLACK); // Default border color

        if (userStatus) {
            border = BorderFactory.createLineBorder(Color.GREEN); // Green border for users with associated accounts
        }

        if (adminStatus) {
            border = BorderFactory.createLineBorder(Color.RED); // Red border for admin users
        }

        lblPicture.setBorder(border);
    
        lblPicture.setIcon(new ImageIcon(p.getPicPath()));
    }
}
