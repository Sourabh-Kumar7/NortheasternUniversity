/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Random;
import static model.DataManager.personMap;
import static model.DataManager.userByUsernameMap;
import static model.DataManager.userMap;

/**
 *
 * @author sourabhkumar
 */

public class DataGenerator {
    private static final String[] FIRST_NAMES = {"John", "Alice", "Bob", "Emma", "David", "Sarah"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Brown", "Davis", "Wilson", "Lee"};
    private static final String[] GENDERS = {"Male", "Female"};
    private static final String[] EMAIL_DOMAINS = {"example.com", "test.com", "domain.com"};

    private static final int PASSWORD_LENGTH = 10; // You can adjust the password length

    public static User generateUser(boolean isAdmin) throws CustomExceptions.InvalidPasswordException {
        Person person = generatePerson();
        // Generate a random password
        String password = PasswordGenerator.generatePassword(PASSWORD_LENGTH);

        // Hash the password
        String hashedPassword = HashingUtil.hashString(password);
        String username = generateRandomUsername(person.getFirstName(), person.getLastName());
        // Print the generated username, password, and admin status
        System.out.println("Generated Username: " + username);
        System.out.println("Generated Password: " + password);
        System.out.println("Is Admin: " + isAdmin);

        // Create the user based on isAdmin
        User user = new User(person.getId(), username, hashedPassword, isAdmin, true);
        
        // Add the person and user to the maps
        personMap.put(person.getId(), person);
        userMap.put(user.getId(), user);
        userByUsernameMap.put(username, user);
        
        return user;
    }
    
    public static Person generatePerson(){
        String firstName = getRandomElement(FIRST_NAMES);
        String lastName = getRandomElement(LAST_NAMES);
        Date dob = generateRandomDate();
        String gender = getRandomElement(GENDERS);
        String email = generateRandomEmail(firstName, lastName);
        String phoneNumber = generateRandomPhoneNumber();

        Person person = new Person(firstName, lastName, dob, gender, email, phoneNumber, "profile-pic.jpg");
        return person;
    }

    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }

    private static Date generateRandomDate() {
        // Generate a random date, e.g., by using Random or other date generation logic
        // Replace this with your actual date generation logic
        // For simplicity, I'll return the current date as an example
        return new Date();
    }

    private static String generateRandomEmail(String firstName, String lastName) {
        String domain = getRandomElement(EMAIL_DOMAINS);
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain;
    }

    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("9"); // Start with '9' to ensure a valid Indian mobile number
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10)); // Append random digits from 0 to 9
        }
        return phoneNumber.toString();
    }

    private static String generateRandomUsername(String firstName, String lastName) {
        return firstName.toLowerCase() + lastName.toLowerCase() + new Random().nextInt(1000);
    }
}

