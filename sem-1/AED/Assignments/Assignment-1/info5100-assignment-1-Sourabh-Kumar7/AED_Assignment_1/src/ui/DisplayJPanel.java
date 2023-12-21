/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Objects;
import javax.swing.ImageIcon;
import model.Address;
import model.DriverLicense;
import model.InsuranceCoverage;
import model.MedicalDoctor;
import model.PatientMedicalRecord;
import model.Person;
import model.VehicleRegistration;

/**
 *
 * @author sourabhkumar
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    Address address;
    Person person;
    DriverLicense driverLicense;
    VehicleRegistration vehicleRegistration;
    InsuranceCoverage insuranceCoverage;
    MedicalDoctor medicalDoctor;
    PatientMedicalRecord patient;
//    DisplayJPanel displayPanel = new DisplayJPanel(address, person, driverLicense, vehicleRegistration, insuranceCoverage, medicalDoctor, patient);
    public DisplayJPanel(Address address, Person person, DriverLicense driverLicense, VehicleRegistration vehicleRegistration, InsuranceCoverage insuranceCoverage, MedicalDoctor medicalDoctor, PatientMedicalRecord patient) {
        initComponents();
        this.address = address;
        this.person = person;
        this.driverLicense = driverLicense;
        this.vehicleRegistration = vehicleRegistration;
        this.insuranceCoverage = insuranceCoverage;
        this.medicalDoctor = medicalDoctor;
        this.patient = patient;
        
        displayReport();
    }
    
    public void displayReport() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Define the date format
        
        
        // Set text in JTextPane components for Address
        addressAptTextPane.setText(Objects.toString(address.getApartment(), ""));
        addressStreetTextPane.setText(Objects.toString(address.getStreet(), ""));
        addressCityTextPane.setText(Objects.toString(address.getCity(), ""));
        addressStateTextPane.setText(Objects.toString(address.getState(), ""));
        addressPostalCodeTextPane.setText(Objects.toString(address.getPostalCode(), ""));
        addressCountryTextPane.setText(Objects.toString(address.getCountry(), ""));
        addressNameTextPane.setText(Objects.toString(address.getName(), ""));
        addressPhoneNumTextPane.setText(Objects.toString(address.getPhoneNumber(), ""));

        // Set text in JTextPane components for DriverLicense
        licenseNumTextPane.setText(Objects.toString(driverLicense.getLicenseNumber(), ""));
        licenseIssueTextPane.setText(driverLicense.getIssueDate() != null ? dateFormat.format(driverLicense.getIssueDate()) : "");
        licenseExpireTextPane.setText(driverLicense.getExpirationDate() != null ? dateFormat.format(driverLicense.getExpirationDate()) : "");
        licenseIssueAuthTextPane.setText(Objects.toString(driverLicense.getIssuingAuthority(), ""));

        // Set text in JTextPane components for InsuranceCoverage
        insuranceCIDTextPane.setText(Objects.toString(insuranceCoverage.getCorporateIdNumber(), ""));
        insuranceBenefitTextPane.setText(Objects.toString(insuranceCoverage.getBenefitsDescription(), ""));
        insuranceDeductibleTextPane.setText(Objects.toString(Double.toString(insuranceCoverage.getDeductible()), ""));
        insurancePremiumTextPane.setText(Objects.toString(Double.toString(insuranceCoverage.getPremium()), ""));
        insuranceAddressTextPane.setText(Objects.toString(insuranceCoverage.getCompanyAddress(), ""));

        // Set text in JTextPane components for MedicalDoctor
        doctorIDTextPane.setText(Objects.toString(medicalDoctor.getDocId(), ""));
        doctorNameTextPane.setText(Objects.toString(medicalDoctor.getName(), ""));
        doctorSpecialityTextPane.setText(Objects.toString(medicalDoctor.getSpecialty(), ""));
        doctorLicNumTextPane.setText(Objects.toString(medicalDoctor.getLicenseNumber(), ""));
        doctorEducationTextPane.setText(Objects.toString(medicalDoctor.getEducation(), ""));
        doctorHospAffilTextPane.setText(Objects.toString(medicalDoctor.getHospitalAffiliation(), ""));
        doctorContactTextPane.setText(Objects.toString(medicalDoctor.getContactNumber(), ""));
        doctorEmailTextPane.setText(Objects.toString(medicalDoctor.getEmail(), ""));

        // Set text in JTextPane components for PatientMedicalRecord
        patientIDTextPane.setText(Objects.toString(patient.getPatientId(), ""));
        patientPrimDocTextPane.setText(Objects.toString(patient.getPrimaryDoctor(), ""));
        patientLastTextPane.setText(patient.getLastVisitDate() != null ? dateFormat.format(patient.getLastVisitDate()) : "");
        patientNextTextPane.setText(patient.getNextAppointmentDate() != null ? dateFormat.format(patient.getNextAppointmentDate()) : "");
        patientAllergiesTextPane.setText(Objects.toString(patient.isAllergies() ? "Yes" : "No", ""));
        patientOnMedicTextPane.setText(Objects.toString(patient.isOnMedication() ? "Yes" : "No", ""));

        // Set text in JTextPane components for Person
        personSSNTextPane.setText(Objects.toString(person.getSsn(), ""));
        personNameTextPane.setText(Objects.toString(person.getName(), ""));
        personDOBTextPane.setText(person.getDateOfBirth() != null ? dateFormat.format(person.getDateOfBirth()) : "");
        personGenderTextPane.setText(Objects.toString(person.getGender(), ""));
        personContactTextPane.setText(Objects.toString(person.getPhoneNumber(), ""));
        personWebUrlTextPane.setText(Objects.toString(person.getWebsiteUrl(), ""));
        personEmailTextPane.setText(Objects.toString(person.getEmail(), ""));
        personProfessionTextPane.setText(Objects.toString(person.getProfession(), ""));
        personBloodTypeTextPane.setText(Objects.toString(person.getBloodType(), ""));

        Image scaledImage = person.getImage();
        if (scaledImage != null) {
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
            pictureLabel.setIcon(scaledImageIcon);
            pictureLabel.revalidate();
            pictureLabel.repaint();
        }

        // Set text in JTextPane components for VehicleRegistration
        vehRegNumTextPane.setText(Objects.toString(vehicleRegistration.getVehicleRegistrationNumber(), ""));
        vehManufTextPane.setText(Objects.toString(vehicleRegistration.getVehicleMake(), ""));
        vehModelTextPane.setText(Objects.toString(vehicleRegistration.getVehicleModel(), ""));
        vehManuYearTextPane.setText(Objects.toString(vehicleRegistration.getManufacturingYear(), ""));
        vehColorTextPane.setText(Objects.toString(vehicleRegistration.getVehicleColor(), ""));
        
        StringBuilder reportBuilder = new StringBuilder();
        
        reportBuilder.append("\n\n**********Display Report**********\n");
        // Append Person information
        reportBuilder.append("\n\nPerson Information:\n");
        reportBuilder.append("SSN: ").append(Objects.toString(person.getSsn(), "")).append("\n");
        reportBuilder.append("Name: ").append(Objects.toString(person.getName(), "")).append("\n");
        reportBuilder.append("Date of Birth: ").append(person.getDateOfBirth() != null ? dateFormat.format(person.getDateOfBirth()) : "").append("\n");
        reportBuilder.append("Gender: ").append(Objects.toString(person.getGender(), "")).append("\n");
        reportBuilder.append("Contact Number: ").append(Objects.toString(person.getPhoneNumber(), "")).append("\n");
        reportBuilder.append("Website URL: ").append(Objects.toString(person.getWebsiteUrl(), "")).append("\n");
        reportBuilder.append("Email: ").append(Objects.toString(person.getEmail(), "")).append("\n");
        reportBuilder.append("Profession: ").append(Objects.toString(person.getProfession(), "")).append("\n");
        reportBuilder.append("Blood Type: ").append(Objects.toString(person.getBloodType(), "")).append("\n");

        // Append Address information
        reportBuilder.append("\n\nAddress Information:\n");
        reportBuilder.append("Apartment: ").append(Objects.toString(address.getApartment(), "")).append("\n");
        reportBuilder.append("Street: ").append(Objects.toString(address.getStreet(), "")).append("\n");
        reportBuilder.append("City: ").append(Objects.toString(address.getCity(), "")).append("\n");
        reportBuilder.append("State: ").append(Objects.toString(address.getState(), "")).append("\n");
        reportBuilder.append("Postal Code: ").append(Objects.toString(address.getPostalCode(), "")).append("\n");
        reportBuilder.append("Country: ").append(Objects.toString(address.getCountry(), "")).append("\n");
        reportBuilder.append("Name: ").append(Objects.toString(address.getName(), "")).append("\n");
        reportBuilder.append("Phone Number: ").append(Objects.toString(address.getPhoneNumber(), "")).append("\n");

        // Append Driver License information
        reportBuilder.append("\n\nDriver License Information:\n");
        reportBuilder.append("License Number: ").append(Objects.toString(driverLicense.getLicenseNumber(), "")).append("\n");
        reportBuilder.append("Issue Date: ").append(driverLicense.getIssueDate() != null ? dateFormat.format(driverLicense.getIssueDate()) : "").append("\n");
        reportBuilder.append("Expiration Date: ").append(driverLicense.getExpirationDate() != null ? dateFormat.format(driverLicense.getExpirationDate()) : "").append("\n");
        reportBuilder.append("Issuing Authority: ").append(Objects.toString(driverLicense.getIssuingAuthority(), "")).append("\n");

        // Append Insurance Coverage information
        reportBuilder.append("\n\nInsurance Coverage Information:\n");
        reportBuilder.append("Corporate ID Number: ").append(Objects.toString(insuranceCoverage.getCorporateIdNumber(), "")).append("\n");
        reportBuilder.append("Benefits Description: ").append(Objects.toString(insuranceCoverage.getBenefitsDescription(), "")).append("\n");
        reportBuilder.append("Deductible: ").append(Objects.toString(Double.toString(insuranceCoverage.getDeductible()), "")).append("\n");
        reportBuilder.append("Premium: ").append(Objects.toString(Double.toString(insuranceCoverage.getPremium()), "")).append("\n");
        reportBuilder.append("Company Address: ").append(Objects.toString(insuranceCoverage.getCompanyAddress(), "")).append("\n");

        // Append Medical Doctor information
        reportBuilder.append("\n\nMedical Doctor Information:\n");
        reportBuilder.append("Doctor ID: ").append(Objects.toString(medicalDoctor.getDocId(), "")).append("\n");
        reportBuilder.append("Name: ").append(Objects.toString(medicalDoctor.getName(), "")).append("\n");
        reportBuilder.append("Specialty: ").append(Objects.toString(medicalDoctor.getSpecialty(), "")).append("\n");
        reportBuilder.append("License Number: ").append(Objects.toString(medicalDoctor.getLicenseNumber(), "")).append("\n");
        reportBuilder.append("Education: ").append(Objects.toString(medicalDoctor.getEducation(), "")).append("\n");
        reportBuilder.append("Hospital Affiliation: ").append(Objects.toString(medicalDoctor.getHospitalAffiliation(), "")).append("\n");
        reportBuilder.append("Contact Number: ").append(Objects.toString(medicalDoctor.getContactNumber(), "")).append("\n");
        reportBuilder.append("Email: ").append(Objects.toString(medicalDoctor.getEmail(), "")).append("\n");
        
        // Append Patient Medical Record information
        reportBuilder.append("\n\nPatient Medical Record:\n");
        reportBuilder.append("Patient ID: ").append(Objects.toString(patient.getPatientId(), "")).append("\n");
        reportBuilder.append("Primary Doctor: ").append(Objects.toString(patient.getPrimaryDoctor(), "")).append("\n");
        reportBuilder.append("Last Visit Date: ").append(patient.getLastVisitDate() != null ? dateFormat.format(patient.getLastVisitDate()) : "").append("\n");
        reportBuilder.append("Next Appointment Date: ").append(patient.getNextAppointmentDate() != null ? dateFormat.format(patient.getNextAppointmentDate()) : "").append("\n");
        reportBuilder.append("Allergies: ").append(Objects.toString(patient.isAllergies() ? "Yes" : "No", "")).append("\n");
        reportBuilder.append("On Medication: ").append(Objects.toString(patient.isOnMedication() ? "Yes" : "No", "")).append("\n");

        // Append Vehicle Registration information
        reportBuilder.append("\n\nVehicle Registration Information:\n");
        reportBuilder.append("Vehicle Registration Number: ").append(Objects.toString(vehicleRegistration.getVehicleRegistrationNumber(), "")).append("\n");
        reportBuilder.append("Vehicle Make: ").append(Objects.toString(vehicleRegistration.getVehicleMake(), "")).append("\n");
        reportBuilder.append("Vehicle Model: ").append(Objects.toString(vehicleRegistration.getVehicleModel(), "")).append("\n");
        reportBuilder.append("Manufacturing Year: ").append(Objects.toString(vehicleRegistration.getManufacturingYear(), "")).append("\n");
        reportBuilder.append("Vehicle Color: ").append(Objects.toString(vehicleRegistration.getVehicleColor(), "")).append("\n");

        
        System.out.println(reportBuilder.toString());

    }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblWebsite = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCreatePerson = new javax.swing.JLabel();
        lblProfession = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        personNameTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        personGenderTextPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        personDOBTextPane = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        personSSNTextPane = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        personProfessionTextPane = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        personWebUrlTextPane = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        personEmailTextPane = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        personContactTextPane = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        personBloodTypeTextPane = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblApartment = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCreateAddress = new javax.swing.JLabel();
        lblPhoneNumber2 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        addressNameTextPane = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        addressAptTextPane = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        addressStreetTextPane = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        addressCityTextPane = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        addressStateTextPane = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        addressCountryTextPane = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        addressPostalCodeTextPane = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        addressPhoneNumTextPane = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        lblAddress = new javax.swing.JLabel();
        lblCreateInsurance = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblDeductible = new javax.swing.JLabel();
        lblExpirationDate = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        licenseNumTextPane = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        licenseIssueTextPane = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        licenseExpireTextPane = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        licenseIssueAuthTextPane = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        lblAddress1 = new javax.swing.JLabel();
        lblHospitalAffiliation = new javax.swing.JLabel();
        lblCreateInsurance1 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        lblDeductible1 = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        vehRegNumTextPane = new javax.swing.JTextPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        vehManufTextPane = new javax.swing.JTextPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        vehModelTextPane = new javax.swing.JTextPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        vehManuYearTextPane = new javax.swing.JTextPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        vehColorTextPane = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        lblCreateInsurance2 = new javax.swing.JLabel();
        lblID2 = new javax.swing.JLabel();
        lblDeductible2 = new javax.swing.JLabel();
        lblPremium1 = new javax.swing.JLabel();
        lblAddress2 = new javax.swing.JLabel();
        lblHospitalAffiliation1 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        insuranceCIDTextPane = new javax.swing.JTextPane();
        jScrollPane29 = new javax.swing.JScrollPane();
        insurancePremiumTextPane = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        insuranceAddressTextPane = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        insuranceDeductibleTextPane = new javax.swing.JTextPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        insuranceBenefitTextPane = new javax.swing.JTextPane();
        jPanel7 = new javax.swing.JPanel();
        lblName2 = new javax.swing.JLabel();
        lblCreateDoctor = new javax.swing.JLabel();
        lblEducation = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        lblSpeciality = new javax.swing.JLabel();
        lblOfficeAddress = new javax.swing.JLabel();
        lblHospitalAffiliation2 = new javax.swing.JLabel();
        lblPhoneNumber3 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        doctorIDTextPane = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        doctorNameTextPane = new javax.swing.JTextPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        doctorAddressTextPane = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        doctorSpecialityTextPane = new javax.swing.JTextPane();
        jScrollPane37 = new javax.swing.JScrollPane();
        doctorHospAffilTextPane = new javax.swing.JTextPane();
        jScrollPane38 = new javax.swing.JScrollPane();
        doctorLicNumTextPane = new javax.swing.JTextPane();
        jScrollPane39 = new javax.swing.JScrollPane();
        doctorContactTextPane = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        doctorEducationTextPane = new javax.swing.JTextPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        doctorEmailTextPane = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        lblDeductible3 = new javax.swing.JLabel();
        lblAddress3 = new javax.swing.JLabel();
        lblHospitalAffiliation3 = new javax.swing.JLabel();
        lblHospitalAffiliation4 = new javax.swing.JLabel();
        lblCreateInsurance3 = new javax.swing.JLabel();
        lblID4 = new javax.swing.JLabel();
        lblPremium2 = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        patientIDTextPane = new javax.swing.JTextPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        patientLastTextPane = new javax.swing.JTextPane();
        jScrollPane44 = new javax.swing.JScrollPane();
        patientAllergiesTextPane = new javax.swing.JTextPane();
        jScrollPane45 = new javax.swing.JScrollPane();
        patientPrimDocTextPane = new javax.swing.JTextPane();
        jScrollPane46 = new javax.swing.JScrollPane();
        patientNextTextPane = new javax.swing.JTextPane();
        jScrollPane47 = new javax.swing.JScrollPane();
        patientOnMedicTextPane = new javax.swing.JTextPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(550, 2350));

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        lblWebsite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWebsite.setText("Website Url");

        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDob.setText("DOB");

        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber1.setText("Blood Type");

        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSsn.setText("SSN");

        pictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureLabel.setText("No Picture");
        pictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        lblCreatePerson.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreatePerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePerson.setText("Person");

        lblProfession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfession.setText("Profession");

        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber.setText("Phone Number");

        personNameTextPane.setEditable(false);
        jScrollPane2.setViewportView(personNameTextPane);

        personGenderTextPane.setEditable(false);
        jScrollPane3.setViewportView(personGenderTextPane);

        personDOBTextPane.setEditable(false);
        jScrollPane4.setViewportView(personDOBTextPane);

        personSSNTextPane.setEditable(false);
        jScrollPane5.setViewportView(personSSNTextPane);

        personProfessionTextPane.setEditable(false);
        jScrollPane6.setViewportView(personProfessionTextPane);

        personWebUrlTextPane.setEditable(false);
        jScrollPane7.setViewportView(personWebUrlTextPane);

        personEmailTextPane.setEditable(false);
        jScrollPane8.setViewportView(personEmailTextPane);

        personContactTextPane.setEditable(false);
        jScrollPane9.setViewportView(personContactTextPane);

        personBloodTypeTextPane.setEditable(false);
        jScrollPane10.setViewportView(personBloodTypeTextPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(lblCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDob, lblEmail, lblGender, lblName, lblPhoneNumber, lblPhoneNumber1, lblProfession, lblSsn, lblWebsite});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane10, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5, jScrollPane6, jScrollPane7, jScrollPane8, jScrollPane9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhoneNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhoneNumber1)))
                .addGap(66, 66, 66))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane10, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5, jScrollPane6, jScrollPane7, jScrollPane8, jScrollPane9, lblDob, lblEmail, lblGender, lblName, lblPhoneNumber, lblPhoneNumber1, lblProfession, lblSsn, lblWebsite});

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCity.setText("City");

        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStreet.setText("Street");

        lblApartment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApartment.setText("Apartment");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblState.setText("State");

        lblCreateAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreateAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateAddress.setText("Address");

        lblPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber2.setText("Phone Number");

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("Name");
        lblName1.setPreferredSize(new java.awt.Dimension(34, 23));

        lblZipCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblZipCode.setText("Postal Code");

        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountry.setText("Country");

        addressNameTextPane.setEditable(false);
        addressNameTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane11.setViewportView(addressNameTextPane);

        addressAptTextPane.setEditable(false);
        addressAptTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane12.setViewportView(addressAptTextPane);

        addressStreetTextPane.setEditable(false);
        addressStreetTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane13.setViewportView(addressStreetTextPane);

        addressCityTextPane.setEditable(false);
        addressCityTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane14.setViewportView(addressCityTextPane);

        addressStateTextPane.setEditable(false);
        addressStateTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane15.setViewportView(addressStateTextPane);

        addressCountryTextPane.setEditable(false);
        addressCountryTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane16.setViewportView(addressCountryTextPane);

        addressPostalCodeTextPane.setEditable(false);
        addressPostalCodeTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane17.setViewportView(addressPostalCodeTextPane);

        addressPhoneNumTextPane.setEditable(false);
        addressPhoneNumTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane18.setViewportView(addressPhoneNumTextPane);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApartment)
                            .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStreet)
                            .addComponent(lblCity)
                            .addComponent(lblState)
                            .addComponent(lblCountry)
                            .addComponent(lblZipCode)
                            .addComponent(lblPhoneNumber2))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane11, jScrollPane12, jScrollPane13, jScrollPane14, jScrollPane15, jScrollPane16, jScrollPane17, jScrollPane18});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblApartment, lblCity, lblCountry, lblName1, lblPhoneNumber2, lblState, lblStreet, lblZipCode});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStreet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblState)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCountry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblZipCode)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNumber2)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane11, jScrollPane12, jScrollPane13, jScrollPane14, jScrollPane15, jScrollPane16, jScrollPane17, jScrollPane18, lblApartment, lblCity, lblCountry, lblName1, lblPhoneNumber2, lblState, lblStreet, lblZipCode});

        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("Issue Date");

        lblCreateInsurance.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreateInsurance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateInsurance.setText("License");

        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("License Number");

        lblDeductible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeductible.setText("Issuing Authority");

        lblExpirationDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExpirationDate.setText("Expiration Date");

        licenseNumTextPane.setEditable(false);
        licenseNumTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane19.setViewportView(licenseNumTextPane);

        licenseIssueTextPane.setEditable(false);
        licenseIssueTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane20.setViewportView(licenseIssueTextPane);

        licenseExpireTextPane.setEditable(false);
        licenseExpireTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane21.setViewportView(licenseExpireTextPane);

        licenseIssueAuthTextPane.setEditable(false);
        licenseIssueAuthTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane22.setViewportView(licenseIssueAuthTextPane);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblCreateInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblExpirationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDeductible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane19, jScrollPane20, jScrollPane21, jScrollPane22});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress, lblDeductible, lblExpirationDate, lblID});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCreateInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExpirationDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeductible, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane19, jScrollPane20, jScrollPane21, jScrollPane22, lblAddress, lblDeductible, lblExpirationDate, lblID});

        lblAddress1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress1.setText("Manufacturer");

        lblHospitalAffiliation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAffiliation.setText("Vehicle Color");

        lblCreateInsurance1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreateInsurance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateInsurance1.setText("Vehicle Registration");

        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID1.setText("Registration Number");

        lblDeductible1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeductible1.setText("Manufacturing Year");

        lblPremium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPremium.setText("Model");

        vehRegNumTextPane.setEditable(false);
        vehRegNumTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane23.setViewportView(vehRegNumTextPane);

        vehManufTextPane.setEditable(false);
        vehManufTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane24.setViewportView(vehManufTextPane);

        vehModelTextPane.setEditable(false);
        vehModelTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane25.setViewportView(vehModelTextPane);

        vehManuYearTextPane.setEditable(false);
        vehManuYearTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane26.setViewportView(vehManuYearTextPane);

        vehColorTextPane.setEditable(false);
        vehColorTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane27.setViewportView(vehColorTextPane);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDeductible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospitalAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblCreateInsurance1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress1, lblDeductible1, lblHospitalAffiliation, lblID1, lblPremium});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane23, jScrollPane24, jScrollPane25, jScrollPane26, jScrollPane27});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateInsurance1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID1)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPremium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDeductible1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHospitalAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 43, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane23, jScrollPane24, jScrollPane25, jScrollPane26, jScrollPane27, lblAddress1, lblDeductible1, lblHospitalAffiliation, lblID1, lblPremium});

        lblCreateInsurance2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreateInsurance2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateInsurance2.setText("Insurance");

        lblID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID2.setText("Corporate ID");

        lblDeductible2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeductible2.setText("Deductible");

        lblPremium1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPremium1.setText("Premium");

        lblAddress2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress2.setText("Address");

        lblHospitalAffiliation1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAffiliation1.setText("Benefits Description");

        insuranceCIDTextPane.setEditable(false);
        insuranceCIDTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane28.setViewportView(insuranceCIDTextPane);

        insurancePremiumTextPane.setEditable(false);
        insurancePremiumTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane29.setViewportView(insurancePremiumTextPane);

        insuranceAddressTextPane.setEditable(false);
        insuranceAddressTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane30.setViewportView(insuranceAddressTextPane);

        insuranceDeductibleTextPane.setEditable(false);
        insuranceDeductibleTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane31.setViewportView(insuranceDeductibleTextPane);

        insuranceBenefitTextPane.setEditable(false);
        insuranceBenefitTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane32.setViewportView(insuranceBenefitTextPane);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPremium1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDeductible2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHospitalAffiliation1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateInsurance2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress2, lblDeductible2, lblHospitalAffiliation1, lblID2, lblPremium1});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane28, jScrollPane29, jScrollPane30, jScrollPane31, jScrollPane32});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCreateInsurance2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPremium1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeductible2)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospitalAffiliation1)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane28, jScrollPane29, jScrollPane30, jScrollPane31, jScrollPane32, lblAddress2, lblDeductible2, lblHospitalAffiliation1, lblID2, lblPremium1});

        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName2.setText("Name");

        lblCreateDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreateDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateDoctor.setText("Doctor");

        lblEducation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEducation.setText("Education");

        lblEmail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail1.setText("Email");

        lblID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID3.setText("ID");

        lblLicenseNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLicenseNumber.setText("License Number");

        lblSpeciality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpeciality.setText("Speciality");

        lblOfficeAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOfficeAddress.setText("Office Address");

        lblHospitalAffiliation2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAffiliation2.setText("Hospital Affiliation");

        lblPhoneNumber3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber3.setText("Phone Number");

        doctorIDTextPane.setEditable(false);
        doctorIDTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane33.setViewportView(doctorIDTextPane);

        doctorNameTextPane.setEditable(false);
        doctorNameTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane34.setViewportView(doctorNameTextPane);

        doctorAddressTextPane.setEditable(false);
        doctorAddressTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane35.setViewportView(doctorAddressTextPane);

        doctorSpecialityTextPane.setEditable(false);
        doctorSpecialityTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane36.setViewportView(doctorSpecialityTextPane);

        doctorHospAffilTextPane.setEditable(false);
        doctorHospAffilTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane37.setViewportView(doctorHospAffilTextPane);

        doctorLicNumTextPane.setEditable(false);
        doctorLicNumTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane38.setViewportView(doctorLicNumTextPane);

        doctorContactTextPane.setEditable(false);
        doctorContactTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane39.setViewportView(doctorContactTextPane);

        doctorEducationTextPane.setEditable(false);
        doctorEducationTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane40.setViewportView(doctorEducationTextPane);

        doctorEmailTextPane.setEditable(false);
        doctorEmailTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane41.setViewportView(doctorEmailTextPane);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHospitalAffiliation2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOfficeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(273, 273, 273))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEducation, lblEmail1, lblHospitalAffiliation2, lblID3, lblLicenseNumber, lblName2, lblOfficeAddress, lblPhoneNumber3, lblSpeciality});

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane33, jScrollPane34, jScrollPane35, jScrollPane36, jScrollPane37, jScrollPane38, jScrollPane39, jScrollPane40, jScrollPane41});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOfficeAddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospitalAffiliation2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblEducation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhoneNumber3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail1)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane33, jScrollPane34, jScrollPane35, jScrollPane36, jScrollPane37, jScrollPane38, jScrollPane39, jScrollPane40, jScrollPane41, lblEducation, lblEmail1, lblHospitalAffiliation2, lblID3, lblLicenseNumber, lblName2, lblOfficeAddress, lblPhoneNumber3, lblSpeciality});

        lblDeductible3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeductible3.setText("Date of Next Appointment");

        lblAddress3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress3.setText("Primary Doctor");

        lblHospitalAffiliation3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAffiliation3.setText("On medication");

        lblHospitalAffiliation4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAffiliation4.setText("Allergies");

        lblCreateInsurance3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCreateInsurance3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateInsurance3.setText("Patient");

        lblID4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID4.setText("Patient ID");

        lblPremium2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPremium2.setText("Date of Last Visit");

        patientIDTextPane.setEditable(false);
        patientIDTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane42.setViewportView(patientIDTextPane);

        patientLastTextPane.setEditable(false);
        patientLastTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane43.setViewportView(patientLastTextPane);

        patientAllergiesTextPane.setEditable(false);
        patientAllergiesTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane44.setViewportView(patientAllergiesTextPane);

        patientPrimDocTextPane.setEditable(false);
        patientPrimDocTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane45.setViewportView(patientPrimDocTextPane);

        patientNextTextPane.setEditable(false);
        patientNextTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane46.setViewportView(patientNextTextPane);

        patientOnMedicTextPane.setEditable(false);
        patientOnMedicTextPane.setPreferredSize(new java.awt.Dimension(75, 21));
        jScrollPane47.setViewportView(patientOnMedicTextPane);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPremium2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDeductible3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospitalAffiliation4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospitalAffiliation3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblCreateInsurance3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress3, lblDeductible3, lblHospitalAffiliation3, lblHospitalAffiliation4, lblID4, lblPremium2});

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane42, jScrollPane43, jScrollPane44, jScrollPane45, jScrollPane46, jScrollPane47});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCreateInsurance3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID4)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPremium2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDeductible3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHospitalAffiliation4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHospitalAffiliation3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane42, jScrollPane43, jScrollPane44, jScrollPane45, jScrollPane46, jScrollPane47, lblAddress3, lblDeductible3, lblHospitalAffiliation3, lblHospitalAffiliation4, lblID4, lblPremium2});

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thank you");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane addressAptTextPane;
    private javax.swing.JTextPane addressCityTextPane;
    private javax.swing.JTextPane addressCountryTextPane;
    private javax.swing.JTextPane addressNameTextPane;
    private javax.swing.JTextPane addressPhoneNumTextPane;
    private javax.swing.JTextPane addressPostalCodeTextPane;
    private javax.swing.JTextPane addressStateTextPane;
    private javax.swing.JTextPane addressStreetTextPane;
    private javax.swing.JTextPane doctorAddressTextPane;
    private javax.swing.JTextPane doctorContactTextPane;
    private javax.swing.JTextPane doctorEducationTextPane;
    private javax.swing.JTextPane doctorEmailTextPane;
    private javax.swing.JTextPane doctorHospAffilTextPane;
    private javax.swing.JTextPane doctorIDTextPane;
    private javax.swing.JTextPane doctorLicNumTextPane;
    private javax.swing.JTextPane doctorNameTextPane;
    private javax.swing.JTextPane doctorSpecialityTextPane;
    private javax.swing.JTextPane insuranceAddressTextPane;
    private javax.swing.JTextPane insuranceBenefitTextPane;
    private javax.swing.JTextPane insuranceCIDTextPane;
    private javax.swing.JTextPane insuranceDeductibleTextPane;
    private javax.swing.JTextPane insurancePremiumTextPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblAddress3;
    private javax.swing.JLabel lblApartment;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCreateAddress;
    private javax.swing.JLabel lblCreateDoctor;
    private javax.swing.JLabel lblCreateInsurance;
    private javax.swing.JLabel lblCreateInsurance1;
    private javax.swing.JLabel lblCreateInsurance2;
    private javax.swing.JLabel lblCreateInsurance3;
    private javax.swing.JLabel lblCreatePerson;
    private javax.swing.JLabel lblDeductible;
    private javax.swing.JLabel lblDeductible1;
    private javax.swing.JLabel lblDeductible2;
    private javax.swing.JLabel lblDeductible3;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEducation;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblExpirationDate;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospitalAffiliation;
    private javax.swing.JLabel lblHospitalAffiliation1;
    private javax.swing.JLabel lblHospitalAffiliation2;
    private javax.swing.JLabel lblHospitalAffiliation3;
    private javax.swing.JLabel lblHospitalAffiliation4;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblID4;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblOfficeAddress;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblPhoneNumber3;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JLabel lblPremium1;
    private javax.swing.JLabel lblPremium2;
    private javax.swing.JLabel lblProfession;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblWebsite;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextPane licenseExpireTextPane;
    private javax.swing.JTextPane licenseIssueAuthTextPane;
    private javax.swing.JTextPane licenseIssueTextPane;
    private javax.swing.JTextPane licenseNumTextPane;
    private javax.swing.JTextPane patientAllergiesTextPane;
    private javax.swing.JTextPane patientIDTextPane;
    private javax.swing.JTextPane patientLastTextPane;
    private javax.swing.JTextPane patientNextTextPane;
    private javax.swing.JTextPane patientOnMedicTextPane;
    private javax.swing.JTextPane patientPrimDocTextPane;
    private javax.swing.JTextPane personBloodTypeTextPane;
    private javax.swing.JTextPane personContactTextPane;
    private javax.swing.JTextPane personDOBTextPane;
    private javax.swing.JTextPane personEmailTextPane;
    private javax.swing.JTextPane personGenderTextPane;
    private javax.swing.JTextPane personNameTextPane;
    private javax.swing.JTextPane personProfessionTextPane;
    private javax.swing.JTextPane personSSNTextPane;
    private javax.swing.JTextPane personWebUrlTextPane;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JTextPane vehColorTextPane;
    private javax.swing.JTextPane vehManuYearTextPane;
    private javax.swing.JTextPane vehManufTextPane;
    private javax.swing.JTextPane vehModelTextPane;
    private javax.swing.JTextPane vehRegNumTextPane;
    // End of variables declaration//GEN-END:variables
}
