/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
/**
 * The {@code MedicalDoctor} class represents a medical doctor's professional information.
 * It includes attributes such as name, office address, specialty, and more.
 */
public class MedicalDoctor {
//    private static int nextDocId = 1;  // Static variable to auto-increment docId
    private int docId;                // Unique identifier for the medical doctor (auto-incremented)
    private String personId;          // Unique identifier for the person associated with the doctor
    private String name;              // Doctor's full name
    private Address officeAddress;     // Office address of the doctor
    private String specialty;         // Medical specialty or field of expertise
    private String licenseNumber;     // Doctor's license number
    private String education;         // Doctor's education and qualifications
    private String hospitalAffiliation; // Hospital where the doctor is affiliated
    private String contactNumber;     // Contact number of the doctor
    private String email;             // Email address of the doctor

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(String hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}

