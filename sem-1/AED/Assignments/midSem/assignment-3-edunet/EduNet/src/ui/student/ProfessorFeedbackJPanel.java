/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.student;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Course;
import model.DataManager;
import static model.DataManager.studentMap;
import model.Student;
import model.StudentFeedback;
import model.User;

/**
 *
 * @author saatw
 */
public class ProfessorFeedbackJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorFeedbackJPanel
     */
    User u;
    Student s;
    public ProfessorFeedbackJPanel(User u) {
        this.u = u;
        s = studentMap.get(u.getId());
        initComponents();
        loadAllEnrolledCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleprofessorfeedback = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFeedback = new javax.swing.JLabel();
        lblRatings = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaFeedBack = new javax.swing.JTextArea();
        jComboBoxRating = new javax.swing.JComboBox<>();

        titleprofessorfeedback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleprofessorfeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleprofessorfeedback.setText("Proffesor Feedback");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Professor ID", "Professor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblFeedback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFeedback.setText("Feedback");

        lblRatings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRatings.setText("Ratings");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jTextAreaFeedBack.setColumns(20);
        jTextAreaFeedBack.setRows(5);
        jScrollPane2.setViewportView(jTextAreaFeedBack);

        jComboBoxRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleprofessorfeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRatings, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBoxRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(btnSubmit)
                        .addGap(34, 34, 34))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblFeedback, lblRatings});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleprofessorfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(lblRatings)
                    .addComponent(jComboBoxRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxRating, lblFeedback, lblRatings});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        // Get the selected row from the table
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            // No course is selected
            JOptionPane.showMessageDialog(this, "Please select a course to provide feedback.");
            return;
        }

        // Get the course ID from the selected row
        int courseId = (int) jTable1.getValueAt(selectedRow, 0);

        // Get the feedback text and rating from the input fields
        String feedbackText = jTextAreaFeedBack.getText().trim();
        int rating = Integer.parseInt(jComboBoxRating.getSelectedItem().toString());

        if (feedbackText.isEmpty()) {
            // Feedback text is empty
            JOptionPane.showMessageDialog(this, "Please provide feedback comments.");
            return;
        }

        if (rating < 1 || rating > 5) {
            // Invalid rating
            JOptionPane.showMessageDialog(this, "Please select a valid rating between 1 and 5.");
            return;
        }

        // Check if the student has already provided feedback for this course
        int studentId = s.getUserId();
        List<StudentFeedback> existingFeedback = DataManager.studentFeedbackMap.get(studentId);

//        if (existingFeedback != null) {
//            for (StudentFeedback feedback : existingFeedback) {
//                if (feedback.getCourseId() == courseId) {
//                    // Student has already provided feedback for this course
//                    JOptionPane.showMessageDialog(this, "You have already provided feedback for this course.");
//                    return;
//                }
//            }
//        }

        // Create a new feedback object
        Course course = DataManager.courseMap.get(courseId);
        StudentFeedback newFeedback = new StudentFeedback(studentId, course.getInstructorID(), courseId, rating, feedbackText);

        // Update feedback maps
        DataManager.studentFeedbackMap.computeIfAbsent(studentId, k -> new ArrayList<>()).add(newFeedback);
        DataManager.courseFeedbackMap.computeIfAbsent(courseId, k -> new ArrayList<>()).add(newFeedback);
        DataManager.professorFeedbackMap.computeIfAbsent(DataManager.courseMap.get(courseId).getInstructorID(), k -> new ArrayList<>()).add(newFeedback);

        // Update course rating
        double oldRating = course.getRating();
        int oldCount = course.getCountEnrolledStudents();

        double newRating = ((oldRating * oldCount) + rating) / (oldCount + 1);
        course.setRating(newRating);

        // Inform the user that feedback has been submitted
        JOptionPane.showMessageDialog(this, "Feedback has been submitted successfully.");

        // Clear the feedback text area
        jTextAreaFeedBack.setText("");

        // Update the course table
        loadAllEnrolledCourses();
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> jComboBoxRating;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaFeedBack;
    private javax.swing.JLabel lblFeedback;
    private javax.swing.JLabel lblRatings;
    private javax.swing.JLabel titleprofessorfeedback;
    // End of variables declaration//GEN-END:variables

    private void loadAllEnrolledCourses() {
        // Clear any existing data from the table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Check if the student is enrolled in any courses
        if (s != null) {
            // Get the list of enrolled courses
            List<Integer> enrolledCourses = s.getEnrolledCoursesId();

            // Iterate through the enrolled courses
            for (int courseId : enrolledCourses) {
                Course course = DataManager.courseMap.get(courseId);

                if (course != null) {
                    // Get the professor for the course
                    User professor = DataManager.userMap.get(course.getInstructorID());

                    // Add course information to the table
                    model.addRow(new Object[]{
                        course.getCourseId(),
                        course.getCourseName(),
                        professor.getId(),
                        professor.getName()
                    });
                }
            }
        }
    }
}
