/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author sourabhkumar
 */
public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    Person person;
    public PersonJPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        websiteUrlTextField = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblWebsite = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblProfession = new javax.swing.JLabel();
        btnSelectPicture = new javax.swing.JButton();
        professionTextField = new javax.swing.JTextField();
        lblCreatePerson = new javax.swing.JLabel();
        ssnTextField = new javax.swing.JTextField();
        pictureLabel = new javax.swing.JLabel();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        lblPhoneNumber1 = new javax.swing.JLabel();
        bloodTypeComboBox = new javax.swing.JComboBox<>();

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender");

        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSsn.setText("SSN");

        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDob.setText("DOB");

        lblWebsite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWebsite.setText("Website Url");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber.setText("Phone Number");

        lblProfession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfession.setText("Profession");

        btnSelectPicture.setText("Select Picture");
        btnSelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPictureActionPerformed(evt);
            }
        });

        lblCreatePerson.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreatePerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePerson.setText("Create Person");

        pictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber1.setText("Blood Type");

        bloodTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProfession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(websiteUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(professionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectPicture)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dobDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 183, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloodTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave))
                        .addComponent(numberTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectPicture)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(websiteUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber1)
                    .addComponent(bloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        nameTextField.setText("");
        numberTextField.setText("");
        dobDateChooser.setDate(null);
        emailTextField.setText("");
        genderComboBox.setSelectedIndex(0); // Clear the selected item in the gender combo box
        bloodTypeComboBox.setSelectedIndex(0); // Clear the selected item in the blood type combo box
        professionTextField.setText("");
        ssnTextField.setText("");
        websiteUrlTextField.setText("");
        pictureLabel.setIcon(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            String ssn = ssnTextField.getText();
            String name = nameTextField.getText();
            Date dateOfBirth = dobDateChooser.getDate();
            String gender = genderComboBox.getSelectedItem().toString();
            String phoneNumber = numberTextField.getText();
            String websiteUrl = websiteUrlTextField.getText();
            String email = emailTextField.getText();
            String profession = professionTextField.getText();
            String bloodType = bloodTypeComboBox.getSelectedItem().toString();
            
            if (ssn.isEmpty() || pictureLabel.getIcon() == null || name.isEmpty() || dateOfBirth == null || phoneNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Missing Information", JOptionPane.ERROR_MESSAGE);
                return; // Don't save if any field is empty
            }
            
            try {
                int pNum = Integer.parseInt(phoneNumber);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String saveDirectory = "images"; // Change this to your desired directory
            String fileName = "person_image.jpg"; // Change the file name as needed

            File saveDirectoryFile = new File(saveDirectory);
            if (!saveDirectoryFile.exists()) {
                // Create the directory if it doesn't exist
                saveDirectoryFile.mkdir();
            }

            File saveFile = new File(saveDirectory, fileName);
            ImageIcon imageIcon = (ImageIcon) pictureLabel.getIcon();
            Image image = imageIcon.getImage();
            try {
                // Save the scaled image to the selected location
                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics2D = bufferedImage.createGraphics();
                graphics2D.drawImage(image, 0, 0, null);
                graphics2D.dispose();
                ImageIO.write(bufferedImage, "jpg", saveFile); // Save as JPG (you can choose the format)
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
            person.setSsn(ssn);
            person.setName(name);
            person.setDateOfBirth(dateOfBirth);
            person.setGender(gender);
            person.setPhoneNumber(phoneNumber);
            person.setWebsiteUrl(websiteUrl);
            person.setEmail(email);
            person.setProfession(profession);
            person.setBloodType(bloodType);
            
            JOptionPane.showMessageDialog(null, "Data saved successfully.");

       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSelectPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPictureActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null); // Show the file chooser dialog
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Load and display the selected picture in the JLabel
            pictureLabel.setPreferredSize(new Dimension(300, 300));
            try {
//                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                int labelWidth = 100;
                int labelHeight = 60;

                // Load and display the selected picture in the JLabel
                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                Image image = imageIcon.getImage();

                // Calculate the scaling factors to fit the image within the label size
                double scaleX = (double) labelWidth / image.getWidth(null);
                double scaleY = (double) labelHeight / image.getHeight(null);

                // Use the scaling factors to create a scaled image
                Image scaledImage = image.getScaledInstance((int) (image.getWidth(null) * scaleX), (int) (image.getHeight(null) * scaleY), Image.SCALE_SMOOTH);
                person.setImage(scaledImage);
                // Create a new ImageIcon from the scaled image
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                pictureLabel.setIcon(scaledImageIcon);
                pictureLabel.revalidate();
                pictureLabel.repaint();
            } catch (Exception ex) {
                ex.printStackTrace();
                // Handle the exception, e.g., display an error message
            }
        }
    }//GEN-LAST:event_btnSelectPictureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bloodTypeComboBox;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectPicture;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel lblCreatePerson;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblProfession;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWebsite;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JTextField professionTextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField websiteUrlTextField;
    // End of variables declaration//GEN-END:variables
}
