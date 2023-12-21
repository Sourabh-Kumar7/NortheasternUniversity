/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sourabhkumar
 */
public class DataManager {

    public static Map<Integer, Person> personMap = new HashMap<>();
    public static Map<Integer, User> userMap = new HashMap<>();
    public static Map<String, User> userByUsernameMap = new HashMap<>(); // New map to store User objects by username

    // Methods for managing Person objects
    public void addPerson(Person person) {
        personMap.put(person.getId(), person);
    }

    public Person getPerson(int pid) {
        return personMap.get(pid);
    }

    public void updatePerson(int pid, Person updatedPerson) {
        if (personMap.containsKey(pid)) {
            personMap.put(pid, updatedPerson);
        }
    }

    public void deletePerson(int pid) {
        personMap.remove(pid);
    }

    // Methods for managing User objects by pid
    public void addUser(User user) {
        userMap.put(user.getPid(), user);
    }

    public User getUser(int pid) {
        return userMap.get(pid);
    }

    public void updateUser(int pid, User updatedUser) {
        if (userMap.containsKey(pid)) {
            userMap.put(pid, updatedUser);
        }
    }

    public void deleteUser(int pid) {
        userMap.remove(pid);
    }

    // Methods for managing User objects by username
    public void addUserByUsername(User user) {
        userByUsernameMap.put(user.getUsername(), user);
    }

    public User getUserByUsername(String username) {
        return userByUsernameMap.get(username);
    }

    public void updateUserByUsername(String username, User updatedUser) {
        if (userByUsernameMap.containsKey(username)) {
            userByUsernameMap.put(username, updatedUser);
        }
    }

    public void deleteUserByUsername(String username) {
        userByUsernameMap.remove(username);
    }
}
