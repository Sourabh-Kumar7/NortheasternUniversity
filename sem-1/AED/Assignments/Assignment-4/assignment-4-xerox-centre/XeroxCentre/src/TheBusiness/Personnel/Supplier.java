/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Personnel;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author sourabhkumar
 */


/**
 * The Supplier class represents a supplier in a business context.
 * Each supplier is associated with a unique person identifier and 
 * manages a set of product IDs that they can supply.
 */
public class Supplier {
    private int personId;
    private Set<Integer> productIds;

    public Supplier(int personId) {
        this.personId = personId;
        this.productIds = new HashSet<>();
    }

    // Adds a product ID to the supplier's list
    public void addProductId(int productId) {
        productIds.add(productId);
    }

    // Removes a product ID from the supplier's list
    public boolean removeProductId(int productId) {
        return productIds.remove(productId);
    }

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Set<Integer> getProductIds() {
        return new HashSet<>(productIds); // To prevent external modification
    }

    // You can also include methods to handle other supplier-related functionalities

}

