package DataManagement;

import static DataManagement.DataManager.adminDirectory;
import static DataManagement.DataManager.customerDirectory;
import static DataManagement.DataManager.marketManagerDirectory;
import static DataManagement.DataManager.salesPersonDirectory;
import static DataManagement.DataManager.supplierDirectory;
import TheBusiness.Personnel.Customer;
import TheBusiness.Personnel.MarketManager;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.SalesPerson;
import TheBusiness.Personnel.Supplier;
import Utils.HashingUtil;
import Utils.PasswordGenerator;
import java.util.Date;
import java.util.Random;

public class DataGenerator {
    private static final String[] FIRST_NAMES = {
        "John", "Alice", "Bob", "Emma", "David", "Sarah", "Arun", "Sourabh", 
        "Amar", "Arjun", "Priti", "Sangam", "Michael", "Emily", "Daniel", 
        "Nisha", "Olivia", "Liam", "Sophia", "Aryan", "Anya", "Ethan", 
        "Ava", "Ishan", "Zara", "Jay", "Mia", "Rohan", "Zoe", "Sana", "Aditya"
    };

    private static final String[] LAST_NAMES = {
        "Smith", "Johnson", "Brown", "Davis", "Wilson", "Lee", "Kumar", 
        "Yadav", "Singh", "Sandhu", "Patel", "Sharma", "Gupta", "Jain", 
        "Kaur", "Shah", "Ali", "Bose", "Chen", "Wang", "Kim", "Liu", 
        "Miller", "Taylor", "Moore", "Clark", "Hernandez", "Martin", "Thompson"
    };

    private static final String[] GENDERS = {"Male", "Female", "Other"};

    private static final String[] EMAIL_DOMAINS = {
        "example.com", "test.com", "domain.com", "mail.com", "mybox.net", 
        "inbox.net", "personal.org", "email.org", "post.com", "usermail.org"
    };


    private static final int PASSWORD_LENGTH = 10;

    public static void generatePerson(String userType, int numberOfUsers){
        for (int i = 0; i < numberOfUsers; i++) {
            String firstName = getRandomElement(FIRST_NAMES);
            String lastName = getRandomElement(LAST_NAMES);
            String name = firstName + " " + lastName;
            Date dob = generateRandomDate();
            String gender = getRandomElement(GENDERS);
            String email = generateRandomEmail(firstName, lastName);
            String phoneNumber = generateRandomPhoneNumber();
            String username = generateUniqueUsername(email); // Updated to include email
            String password = PasswordGenerator.generatePassword(PASSWORD_LENGTH);
            String hashedPassword = HashingUtil.hashString(password);
            
            if (DataManager.usernamePersonMap.containsKey(username)) {
                System.out.println("Generated User with duplicate username: " + username + ". Skipping...");
                continue;
            }
            
            Person person = new Person(name, email, gender, dob, username, hashedPassword, userType, phoneNumber);
            
            switch (userType) {
                case "Customer" -> {
                    Customer customer = new Customer(person.getPersonId(), -1); // Assuming default channelId as -1
                    customerDirectory.put(person.getPersonId(), customer);
                }
                case "Marketing Manager" -> {
                    MarketManager marketManager = new MarketManager(person.getPersonId());
                    marketManagerDirectory.put(person.getPersonId(), marketManager);
                }
                case "Sales Person" -> {
                    SalesPerson salesPerson = new SalesPerson(person.getPersonId());
                    salesPersonDirectory.put(person.getPersonId(), salesPerson);
                }
                case "Supplier Owner" -> {
                    Supplier supplier = new Supplier(person.getPersonId());
                    supplierDirectory.put(person.getPersonId(), supplier);
                }
                case "Admin" -> adminDirectory.put(person.getPersonId(), person);
                default -> {
                }
            }
            // Handle default case or unknown userType
            DataManager.usernamePersonMap.put(username, person);
            DataManager.personDirectory.put(person.getPersonId(), person);
            
            System.out.println("Generated Person with username: " + username);
            System.out.println("Generated Password: " + password);
            System.out.println("User Type: " + userType);
        } // Print the stack trace for debugging
        
    }

    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }

    private static Date generateRandomDate() {
        // Implement random date generation logic here
        return new Date(); // Placeholder
    }

    private static String generateRandomEmail(String firstName, String lastName) {
        String domain = getRandomElement(EMAIL_DOMAINS);
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain;
    }

    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("9");
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }

    private static String generateUniqueUsername(String email) {
        // Implement logic to ensure the uniqueness of the username
        // For simplicity, using email as username
        return email;
    }
}
