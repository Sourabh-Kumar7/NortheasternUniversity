/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.CustomExceptions;
import static model.DataGenerator.generateCoursesForProfessor;
import model.DataManager;
import static model.DataManager.adminMap;
import static model.DataManager.emailUserMap;
import static model.DataManager.professorMap;
import static model.DataManager.studentCourseProgressMap;
import static model.DataManager.studentMap;
import static model.DataManager.userMap;
import model.HashingUtil;
import model.Professor;
import model.Student;
import model.StudentCourseProgress;
import model.User;
import model.validationUtil;
import ui.admin.AdminPortalJFrame;
import ui.professor.ProfessorPortalJFrame;
import ui.student.StudentPortalJFrame;

/**
 *
 * @author sourabhkumar
 */
public class SignUpPageJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPageJFrame
     */
    Image selectedImage = null;
    public SignUpPageJFrame() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Set close operation
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the position to be at the lower left corner
        int x = 0;
        int y = screenSize.height - getHeight();

        setLocation(x, y);

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
        lblEmail = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextPane();
        lblPhone = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPhone = new javax.swing.JTextPane();
        lblName = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        btnSelectPicture = new javax.swing.JButton();
        lblUsrType = new javax.swing.JLabel();
        jComboBoxUserType = new javax.swing.JComboBox<>();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        jRadioButtonShowPassword = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Sign Up");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        jScrollPane3.setViewportView(txtName);

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone No.");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(txtPhone);

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jScrollPane5.setViewportView(txtEmail);

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDOB.setText("DOB");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender");

        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSelectPicture.setText("Select Picture");
        btnSelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPictureActionPerformed(evt);
            }
        });

        lblUsrType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsrType.setText("User Type");

        jComboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Professor" }));
        jComboBoxUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserTypeActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jRadioButtonShowPassword.setText("Show Password");
        jRadioButtonShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonShowPasswordActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirm Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSelectPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblPhone)
                    .addComponent(lblDOB)
                    .addComponent(lblUsrType)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButtonShowPassword)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, lblDOB, lblEmail, lblGender, lblName, lblPhone, lblUsrType});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxGender, jComboBoxUserType, jConfirmPassword, jDateChooserDOB, jPassword, jScrollPane3, jScrollPane4, jScrollPane5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectPicture)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsrType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblEmail)
                                                .addGap(11, 11, 11)))
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPhone)
                                        .addGap(39, 39, 39))))
                            .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButtonShowPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lblDOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGender)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, lblDOB, lblEmail, lblGender, lblName, lblPhone, lblUsrType});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxGender, jComboBoxUserType, jConfirmPassword, jDateChooserDOB, jPassword, jScrollPane3, jScrollPane4, jScrollPane5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

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
                int labelWidth = 120;
                int labelHeight = 90;

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            // Validate and retrieve user input
            String name = txtName.getText().trim();
            String email = txtEmail.getText().trim();
            String phone = txtPhone.getText().trim();
            Date dob = jDateChooserDOB.getDate();
            String gender = (String) jComboBoxGender.getSelectedItem();
            String userType = (String) jComboBoxUserType.getSelectedItem();
            char[] password = jPassword.getPassword();
            char[] confirmPassword = jConfirmPassword.getPassword();
            boolean isEnabled = true;

            // Validate input fields
            validationUtil.validateName(name);
            validationUtil.validateEmail(email);
            validationUtil.validatePhoneNumber(phone);
            validationUtil.validateDateOfBirth(dob);
            
            if (DataManager.emailUserMap.containsKey(email)) {
                throw new CustomExceptions.InvalidEmailException("Email already in use by another user.");
            }
            
            // Validate password fields
            String passwordString = String.valueOf(password);
            validationUtil.validatePassword(passwordString);

            if (!Arrays.equals(password, confirmPassword)) {
                throw new model.CustomExceptions.InvalidPasswordException("Passwords do not match.");
            }

            // Convert password to hashed format (you may want to store this in your User object)
            String hashedPassword = HashingUtil.hashString(passwordString);
            
            
            // Create the user based on isAdmin
            User user = new User(name, dob, gender, email, phone, hashedPassword, isEnabled, userType);

            switch (userType) {
                case "Admin" -> adminMap.put(user.getId(), user);
                case "Student" -> {
                    Student student = new Student(user.getId());
                    studentMap.put(user.getId(), student);
                    StudentCourseProgress studentCourseProgress = new StudentCourseProgress(user.getId());
                    studentCourseProgressMap.put(user.getId(), studentCourseProgress);
                }
                case "Professor" -> {
                    Professor prof = new Professor(user.getId());
                    professorMap.put(user.getId(), prof);
                    int courseCount = new Random().nextInt(10);
                    generateCoursesForProfessor(user.getId(), courseCount);
                }
                default -> {
                }
            }

            userMap.put(user.getId(), user);
            emailUserMap.put(user.getEmail(), user);
            
            // You can add more validations for other fields like picture path, etc.
            if (selectedImage != null) {
                // Get the person's ID
                String userId = Integer.toString(user.getId());
                String imagePath = "data/images/" + userType + "_" + userId + ".jpg";
                File imageFile = new File(imagePath);

                // Convert the selected image to a BufferedImage
                BufferedImage bufferedImage = new BufferedImage(selectedImage.getWidth(null),
                        selectedImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = bufferedImage.createGraphics();
                g2.drawImage(selectedImage, 0, 0, null);
                g2.dispose();

                try {
                    ImageIO.write(bufferedImage, "jpg", imageFile);
                    user.setPicPath(imagePath);
                } catch (IOException e) {
                    System.err.println("Failed to add picture to user. Error: " + e.getMessage());
                }
            }

            // If all validations pass, you can save the user data to the DataManager
            // For now, I'll just print the data for demonstration
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Date of Birth: " + dob);
            System.out.println("Gender: " + gender);
            System.out.println("User Type: " + userType);
            System.out.println("Hashed Password: " + hashedPassword);

            
            javax.swing.JOptionPane.showMessageDialog(this, "User created successfully! User ID: " + user.getId());
            
            loadUserPortal(user);
            // Clear input fields after successful save
            clearFields();
        } catch (model.CustomExceptions.InvalidNameException | 
                 model.CustomExceptions.InvalidEmailException | 
                 model.CustomExceptions.InvalidPhoneNumberException | 
                 model.CustomExceptions.InvalidDateOfBirthException |
                 model.CustomExceptions.InvalidPasswordException e) {
            // Handle validation errors
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void clearFields() {
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        jDateChooserDOB.setDate(null);
        jComboBoxGender.setSelectedIndex(0);
        jComboBoxUserType.setSelectedIndex(0);
        jPassword.setText("");
        jConfirmPassword.setText("");
        jRadioButtonShowPassword.setSelected(false);
        lblPicture.setIcon(null);
        selectedImage = null;
    }
    
    private void jComboBoxUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUserTypeActionPerformed

    private void jRadioButtonShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonShowPasswordActionPerformed
        // TODO add your handling code here:
        boolean showPassword = jRadioButtonShowPassword.isSelected();

        if (showPassword) {
            // Show password as plain text
            jPassword.setEchoChar((char) 0); // Set echo char to 0 to display plain text
            jConfirmPassword.setEchoChar((char) 0);
        } else {
            // Hide password with asterisks (default behavior)
            jPassword.setEchoChar('*');
            jConfirmPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButtonShowPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectPicture;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JComboBox<String> jComboBoxUserType;
    private javax.swing.JPasswordField jConfirmPassword;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioButtonShowPassword;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsrType;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtName;
    private javax.swing.JTextPane txtPhone;
    // End of variables declaration//GEN-END:variables

    private void loadUserPortal(User user) {
        switch (user.getUserType()) {
            case "Professor" -> {
                ProfessorPortalJFrame profPortal = new ProfessorPortalJFrame(user);
                profPortal.setVisible(true);
            }
            case "Student" -> {
                StudentPortalJFrame studPortal = new StudentPortalJFrame(user);
                studPortal.setVisible(true);
            }
            default -> {
                AdminPortalJFrame adminPortal = new AdminPortalJFrame(user);
                adminPortal.setVisible(true);
            }
        }
        dispose(); // Close the second frame
    }
}
