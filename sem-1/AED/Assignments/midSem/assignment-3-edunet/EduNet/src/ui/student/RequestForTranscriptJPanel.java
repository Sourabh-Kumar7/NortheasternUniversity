/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.student;

import java.util.Map;
import model.Course;
import model.CourseProgress;
import model.DataManager;
import model.StudentCourseProgress;
import model.TranscriptGenerator;
import model.User;


/**
 *
 * @author saatw
 */
public class RequestForTranscriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestForTranscriptJPanel
     */
    User u;
    public RequestForTranscriptJPanel(User u) {
        this.u = u;
        initComponents();
        initLoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlerequesttranscript = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseListTxtArea = new javax.swing.JTextArea();
        btnCheckEligibility = new javax.swing.JButton();
        btnDownloadTranscript = new javax.swing.JButton();

        titlerequesttranscript.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titlerequesttranscript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlerequesttranscript.setText("REQUEST TRANSCRIPT");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student ID");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Name");

        txtStudentID.setEditable(false);
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });

        txtStudentName.setEditable(false);
        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Completed Courses");

        courseListTxtArea.setEditable(false);
        courseListTxtArea.setColumns(20);
        courseListTxtArea.setRows(5);
        jScrollPane1.setViewportView(courseListTxtArea);

        btnCheckEligibility.setText("Check Eligibility");
        btnCheckEligibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckEligibilityActionPerformed(evt);
            }
        });

        btnDownloadTranscript.setText("Download Transcript");
        btnDownloadTranscript.setEnabled(false);
        btnDownloadTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadTranscriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titlerequesttranscript, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCheckEligibility, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStudentID)
                                    .addComponent(txtStudentName)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(btnDownloadTranscript)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titlerequesttranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckEligibility, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDownloadTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, txtStudentID, txtStudentName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void btnCheckEligibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckEligibilityActionPerformed
        // Retrieve the student's course progress
        StudentCourseProgress studentProgress = DataManager.studentCourseProgressMap.get(u.getId());

        // Check if the student has completed at least 8 courses
        if (studentProgress != null && countCompletedCourses(studentProgress) >= 8) {
            // Student is eligible, enable the "Download Transcript" button
            btnDownloadTranscript.setEnabled(true);
            // Display an eligibility message
            javax.swing.JOptionPane.showMessageDialog(this, "You are eligible for a transcript.");
        } else {
            // Student is not eligible, display a message
            showNotEligibleMessage();
        }
    }//GEN-LAST:event_btnCheckEligibilityActionPerformed

    private void btnDownloadTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadTranscriptActionPerformed
        // TODO add your handling code here:
        int studentId = Integer.parseInt(txtStudentID.getText());
        // Retrieve the student's course progress
        StudentCourseProgress studentProgress = DataManager.studentCourseProgressMap.get(studentId);
        TranscriptGenerator.generateTranscript(u, studentProgress);
        javax.swing.JOptionPane.showMessageDialog(this, "Transcript Downloaded Successfully.");

    }//GEN-LAST:event_btnDownloadTranscriptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckEligibility;
    private javax.swing.JButton btnDownloadTranscript;
    private javax.swing.JTextArea courseListTxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titlerequesttranscript;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables

    private void initLoadData() {
        // Check if the user (student) object 'u' is not null
        if (u != null) {
            // Set the student ID and name fields
            txtStudentID.setText(Integer.toString(u.getId())); // Assuming that u.getId() returns the student's ID as an integer
            txtStudentName.setText(u.getName()); // Assuming that u.getName() returns the student's name

            // Fill the list of completed courses
            StudentCourseProgress studentProgress = DataManager.studentCourseProgressMap.get(u.getId());
            if (studentProgress != null) {
                StringBuilder completedCoursesText = new StringBuilder();
                for (Map.Entry<Integer, CourseProgress> entry : studentProgress.getCourseProgressMap().entrySet()) {
                    if (entry.getValue().isCompleted()) {
                        Course course = DataManager.courseMap.get(entry.getKey());
                        if (course != null) {
                            completedCoursesText.append(course.getCourseName()).append("\n");
                        }
                    }
                }
                courseListTxtArea.setText(completedCoursesText.toString());
            }
        }
    }
    
    // Helper function to count the number of completed courses
    private int countCompletedCourses(StudentCourseProgress studentProgress) {
        int completedCourses = 0;
        for (CourseProgress progress : studentProgress.getCourseProgressMap().values()) {
            if (progress.isCompleted()) {
                completedCourses++;
            }
        }
        return completedCourses;
    }

    // Method to display a message when the student is not eligible
    private void showNotEligibleMessage() {
        // You can choose how you want to display the message. 
        // For example, you can use a dialog or a label to show the message.
        // Here's an example using a simple dialog:

        javax.swing.JOptionPane.showMessageDialog(this, "You are not eligible for a transcript.\nPlease complete at least 8 courses.");
    }
    
}