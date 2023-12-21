/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import static model.DataManager.personMap;
import static model.HashingUtil.hashString;
import static model.validationUtil.validatePassword;
import ui.MainJFrame;

/**
 *
 * @author sourabhkumar
 */
public class MainApp {
    public static void main(String args[]){
        DataManager dataManager = new DataManager();
        firstAdmin(dataManager);
        
        // Generate 'm' normal users and 'n' admin users
        int m = 10; // Number of normal users to generate
        int n = 3;  // Number of admin users to generate
        int p = 5;  // Number of persons without user account

        generateNormalUsers(m);
        generateAdminUsers(n);
        generateJustPerson(p);
        
        
        
        init_ui();
    };

    private static String createFirstAdmin(DataManager dataManager) throws CustomExceptions.InvalidPasswordException {
        Date dob = new Date(99, 2, 27); // March 27, 1999 (Note: Month is 0-based)
        String password = "Password@123";
        validatePassword(password);
        String hasedPassword  = hashString(password);
        String picPath = "images/1.jpg";
        Person person = new Person("Sourabh", "Kumar", dob, "Male", "sourabh@example.com", "1234567890", picPath);
        User adminUser = new User(person.getId(), "admin", hasedPassword, true, true);

        dataManager.addPerson(person);
        dataManager.addUser(adminUser);
        dataManager.addUserByUsername(adminUser);

        return person.getFirstName();
    }

    private static void init_ui() {
        MainJFrame mainFrame = new MainJFrame();
        mainFrame.setVisible(true);
    }

    private static void firstAdmin(DataManager dataManager) {
        try {
            String firstAdminName = createFirstAdmin(dataManager);
            System.out.println("First Admin User: " + firstAdminName);
        } catch (CustomExceptions.InvalidPasswordException e) {
            System.err.println("Invalid Password: " + e.getMessage());
        }
    }
    
    private static void generateNormalUsers(int count) {
        try {
            for (int i = 0; i < count; i++) {
                User normalUser = DataGenerator.generateUser(false); // Generate a normal user
            }
        } catch (CustomExceptions.InvalidPasswordException e) {
            System.err.println("Error while auto creating normal user: " + e.getMessage());
        }
    }
    
    private static void generateAdminUsers(int count) {
        try {
            for (int i = 0; i < count; i++) {
                User adminUser = DataGenerator.generateUser(true); // Generate an admin user
            }
        } catch (CustomExceptions.InvalidPasswordException e) {
            System.err.println("Error while auto creating admin user: " + e.getMessage());
        }
    }
    
    private static void generateJustPerson(int count) {
        for (int i = 0; i < count; i++) {
                Person person = DataGenerator.generatePerson(); // Generate a normal person
                personMap.put(person.getId(), person);
            }
    }
}
