/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainApp;

import DataManagement.DataLoader;
import DataManagement.DataGenerator;
import UserInterface.User.MainLoginJFrame;
import java.text.ParseException;

/**
 *
 * @author sourabhkumar
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        // Load data
//        DataLoader.loadData();
        DataLoader jl = new DataLoader();
        jl.Jsonloaderfunction();
        generateData();
        MainLoginJFrame mainLogin = new MainLoginJFrame();
        mainLogin.setVisible(true);
    }

    private static void generateData() {
//        DataGenerator.generatePerson("Customer", 20);
//        DataGenerator.generatePerson("Marketing Manager", 3);
//        DataGenerator.generatePerson("Sales Person", 20);
//        DataGenerator.generatePerson("Supplier Owner", 20);
        DataGenerator.generatePerson("Admin", 5);
    }
}
