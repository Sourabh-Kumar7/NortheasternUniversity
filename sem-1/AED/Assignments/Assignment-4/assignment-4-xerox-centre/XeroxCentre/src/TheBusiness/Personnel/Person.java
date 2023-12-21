package TheBusiness.Personnel;

import java.util.Date;

/**
 * The Person class represents an individual with various personal attributes.
 * Each person is assigned a unique identifier upon creation. This class includes
 * attributes such as name, email, gender, date of birth, username, password, user type, 
 * and phone number. Getters and setters are provided for all fields to allow controlled 
 * access and modification of these attributes.
 */
public class Person {
    private static int nextPersonId = 1;
    private int personId;
    private String name;
    private String email;
    private String gender; // Gender as a string
    private Date dateOfBirth;
    private String username;
    private String password;
    private String userType; // User type as a string
    private String phoneNumber; // Phone number as a string

    public Person(String name, String email, String gender, Date dateOfBirth, String username, String password, String userType, String phoneNumber) {
        this.personId = nextPersonId++;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
