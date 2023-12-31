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
import model.CourseProgress;
import model.DataManager;
import static model.DataManager.courseMap;
import static model.DataManager.studentMap;
import static model.DataManager.userMap;
import model.Student;
import model.StudentCourseProgress;
import model.User;

/**
 *
 * @author sourabhkumar
 */
public class RegisterCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisteredCourseJPanel
     */
    User u;
    Student s;
    public RegisterCoursesJPanel(User u) {
        this.u = u;
        this.s = studentMap.get(u.getId());
        initComponents();
        loadUnRegisteredCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBoxSemester = new javax.swing.JComboBox<>();
        titleregistercourses = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCourseTable = new javax.swing.JTable();
        btnregister = new javax.swing.JButton();
        lblCourseID = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        txtCourseId = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        lblProfessor = new javax.swing.JLabel();
        txtProfessorID = new javax.swing.JTextField();

        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Spring", "Summer", "Fall" }));

        titleregistercourses.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleregistercourses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleregistercourses.setText("REGISTER COURSES");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Professor", "Semester", "Year", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jCourseTable);

        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        lblCourseID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCourseID.setText("Course ID");

        lblYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYear.setText("Year");

        lblSemester.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSemester.setText("Semester");

        lblProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfessor.setText("Professor ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(titleregistercourses, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCourseID, lblProfessor});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCourseId, txtProfessorID});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblSemester, lblYear});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleregistercourses, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsearch)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregister)
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnsearch, jComboBoxSemester, lblCourseID, lblProfessor, lblSemester, lblYear, txtCourseId, txtProfessorID, txtYear});

    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        
        loadUnRegisteredCourses();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        // Get the selected row from the table
        int selectedRow = jCourseTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            // No row selected, show an error message
            JOptionPane.showMessageDialog(this, "Please select a course to register.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the course ID from the selected row
        int selectedCourseId = (int) jCourseTable.getValueAt(selectedRow, 0);

        // Get the selected course from the courseMap
        Course selectedCourse = courseMap.get(selectedCourseId);

        // Check if the student is already registered for this course
        if (s.getEnrolledCoursesId().contains(selectedCourseId)) {
            // The student is already registered, show an error message
            JOptionPane.showMessageDialog(this, "You are already registered for this course.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the course is active
        if (!selectedCourse.isActive()) {
            // The course is not active, show an error message
            JOptionPane.showMessageDialog(this, "This course is not currently active.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Register the student for the course
        s.addEnrolledCourse(selectedCourseId);
        selectedCourse.incrementEnrolledStudents();

        // Update the course enrollment count
        // Update the student's enrolled courses list
        // Update the courseFeedbackMap, studentFeedbackMap, and professorFeedbackMap if needed
        StudentCourseProgress studentProgress = DataManager.studentCourseProgressMap.get(u.getId());

        // Check if the student's progress is null (i.e., not in the map)
        if (studentProgress == null) {
            // Create a new progress object for the student
            studentProgress = new StudentCourseProgress(s.getId());
            DataManager.studentCourseProgressMap.put(s.getId(), studentProgress);
        }

        // Create a new CourseProgress object for the selected course
        CourseProgress courseProgress = new CourseProgress(0.0); // You can set the initial progress to 0.0

        // Add the course progress to the student's progress
        studentProgress.setCourseProgress(selectedCourseId, courseProgress);
        // Show a success message
        JOptionPane.showMessageDialog(this, "Successfully registered for the course.", "Registration Success", JOptionPane.INFORMATION_MESSAGE);

        // Refresh the table to reflect the changes
        loadUnRegisteredCourses();
    }//GEN-LAST:event_btnregisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> jComboBoxSemester;
    private javax.swing.JTable jCourseTable;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblProfessor;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel titleregistercourses;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtProfessorID;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void loadUnRegisteredCourses() {
        
        String courseId = txtCourseId.getText().trim();
        String year = txtYear.getText().trim();
        String semester = jComboBoxSemester.getSelectedItem().toString();
        String professorID = txtProfessorID.getText().trim();
        
        // Get the list of all courses
        List<Course> allCourses = new ArrayList<>(courseMap.values());

        // Create a table model for the JTable
        DefaultTableModel tableModel = (DefaultTableModel) jCourseTable.getModel();
        tableModel.setRowCount(0); // Clear existing data in the table

        for (Course course : allCourses) {
            if (!s.getEnrolledCoursesId().contains(course.getCourseId()) // Check if it's an unregistered course
                    && course.isActive() // Check if the course is active
                    && (courseId.isEmpty() || String.valueOf(course.getCourseId()).equals(courseId))
                    && (year.isEmpty() || String.valueOf(course.getYear()).equals(year))
                    && (semester.equals("All") || course.getSemester().equals(semester))
                    && (professorID.isEmpty() || String.valueOf(course.getInstructorID()).equals(professorID))) {
                // Add course details to the table
                Object[] rowData = {
                    course.getCourseId(),
                    course.getCourseName(),
                    getProfessorName(course.getInstructorID()), // You need to implement getProfessorName
                    course.getSemester(),
                    course.getYear(),
                    course.getRating()
                };
                tableModel.addRow(rowData);
            }
        }
    }
    
    // Implement a method to get the professor's name based on the instructorID
    private String getProfessorName(int instructorID) {
        User p = userMap.get(instructorID);
        return p.getName(); // Change this to the actual professor's name.
    }
}
