/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
import java.util.Date;

/**
 * The {@code PatientMedicalRecord} class represents the medical data of a patient,
 * including patient-specific attributes, associations with persons and doctors,
 * and other relevant medical information.
 */
public class PatientMedicalRecord {
//    private static int nextPatientId = 1;  // Static variable to auto-increment patientId
    private int patientId;                // Unique identifier for the patient
    private String personId;              // Unique identifier for the person associated with the patient
    private String doctorId;              // Unique identifier for the patient's doctor
    private String primaryDoctor;         // Primary doctor's name
    private Date lastVisitDate;           // Date of the patient's last visit to the doctor
    private Date nextAppointmentDate;     // Date of the patient's next scheduled appointment
    private boolean allergies;            // Whether the patient has allergies (true or false)
    private boolean onMedication;         // Whether the patient is on medication (true or false)

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Date getNextAppointmentDate() {
        return nextAppointmentDate;
    }

    public void setNextAppointmentDate(Date nextAppointmentDate) {
        this.nextAppointmentDate = nextAppointmentDate;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public boolean isOnMedication() {
        return onMedication;
    }

    public void setOnMedication(boolean onMedication) {
        this.onMedication = onMedication;
    }

}

