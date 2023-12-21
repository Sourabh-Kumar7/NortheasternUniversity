/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author sourabhkumar
 */
public class Person {

    private static int lastAssignedId = 0; // Static variable to keep track of the last assigned ID
    private int id;
    private String firstName;
    private String lastName;
    private Date DOB;
    private String gender;
    private String email;
    private String phoneNum;
    private String picPath;

    /**
     * Constructor to initialize a Person object with an auto-incremented ID.
     *
     * @param firstName The first name of the person.
     * @param lastName  The last name of the person.
     * @param DOB       The date of birth of the person.
     * @param gender    The gender of the person.
     * @param email     The email address of the person.
     * @param phoneNum  The phone number of the person.
     * @param picPath   The path to the person's picture.
     */
    public Person(String firstName, String lastName, Date DOB, String gender, String email, String phoneNum, String picPath){
        // Initialize attributes after validation
        this.id = ++lastAssignedId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.gender = gender;
        this.email = email;
        this.phoneNum = phoneNum;
        this.picPath = picPath;
    }


    public static int getLastAssignedId() {
        return lastAssignedId;
    }

    public static void setLastAssignedId(int lastAssignedId) {
        Person.lastAssignedId = lastAssignedId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", picPath='" + picPath + '\'' +
                '}';
    }
}
