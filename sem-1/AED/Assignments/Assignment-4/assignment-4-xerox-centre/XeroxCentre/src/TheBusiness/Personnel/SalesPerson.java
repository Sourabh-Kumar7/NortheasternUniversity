package TheBusiness.Personnel;

import java.util.ArrayList;

/**
 * The SalesPerson class represents a salesperson in a business.
 * It extends the Profile class and inherits attributes and methods
 * related to a person's profile information.
 *
 * Each SalesPerson has a unique identifier (personId) and manages lists of 
 * order IDs for orders they have picked up and completed.
 */
public class SalesPerson /* extends Profile */ { // Uncomment and extend Profile if needed
    private int personId;
    private ArrayList<Integer> pickedUpOrderIds;
    private ArrayList<Integer> completedOrderIds;

    public SalesPerson(int personId) {
        this.personId = personId;
        this.pickedUpOrderIds = new ArrayList<>();
        this.completedOrderIds = new ArrayList<>();
        
    }

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public ArrayList<Integer> getPickedUpOrderIds() {
        return new ArrayList<>(pickedUpOrderIds); // To prevent external modification
    }

    public void addPickedUpOrderId(int orderId) {
        this.pickedUpOrderIds.add(orderId);
    }

    public ArrayList<Integer> getCompletedOrderIds() {
        return new ArrayList<>(completedOrderIds); // To prevent external modification
    }

    public void addCompletedOrderId(int orderId) {
        this.completedOrderIds.add(orderId);
    }
    
    public void removePickedUpOrderId(int orderId) {
        pickedUpOrderIds.removeIf(id -> id == orderId);
    }

    // Method to remove an Order ID from the completedOrderIds list
    public void removeCompletedOrderId(int orderId) {
        completedOrderIds.removeIf(id -> id == orderId);
    }

    // Additional methods as needed for business logic
}
