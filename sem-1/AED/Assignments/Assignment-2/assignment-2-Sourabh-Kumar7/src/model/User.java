/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
public class User {

    private static int lastAssignedId = 0; // Static variable to keep track of the last assigned ID
    private int id;
    private int pid; // Assuming pid is related to another entity, e.g., Person ID
    private String username;
    private String hashedPassword; // Store the hashed password as a string
    private boolean isAdmin;
    private boolean isEnabled;

    /**
     * Constructor to initialize a User object with an auto-incremented ID.
     *
     * @param pid                The related Person ID.
     * @param username           The username of the user.
     * @param hashedPassword     The hashed password of the user.
     * @param isAdmin            A Boolean indicating if the user is an admin.
     */
    public User(int pid, String username, String hashedPassword, boolean isAdmin, boolean isEnabled){
        this.id = ++lastAssignedId; // Auto-increment the ID
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.pid = pid;
        this.isAdmin = isAdmin;
        this.isEnabled = isEnabled;
        
    }


    public int getId() {
        return id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pid=" + pid +
                ", username='" + username + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
