/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Personnel;

/**
 *
 * @author siddharth
 */

import java.util.ArrayList;
import java.util.List;

/**
 * The Customer class represents a customer in a business context.
 * It includes a person ID, lists of old and ongoing order IDs,
 * and a channel ID indicating the primary channel of interaction.
 */
public class Customer {
    private int personId;
    private List<Integer> oldOrderIds;
    private List<Integer> ongoingOrderIds;
    private int channelId;

    /**
     * Constructs a new Customer with the specified person ID and channel ID.
     *
     * @param personId The unique identifier of the person.
     * @param channelId The primary channel ID associated with the customer. Use -1 for no channel added
     */
    public Customer(int personId, int channelId) {
        this.personId = personId;
        this.channelId = channelId;
        this.oldOrderIds = new ArrayList<>();
        this.ongoingOrderIds = new ArrayList<>();
    }

    // Add an order ID to the list of old orders
    public void addOldOrderId(int orderId) {
        oldOrderIds.add(orderId);
    }

    // Add an order ID to the list of ongoing orders
    public void addOngoingOrderId(int orderId) {
        ongoingOrderIds.add(orderId);
    }

    // Remove an order ID from the list of ongoing orders and add to old orders
    public void completeOrder(int orderId) {
        if (ongoingOrderIds.remove(Integer.valueOf(orderId))) {
            addOldOrderId(orderId);
        }
    }

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public List<Integer> getOldOrderIds() {
        return new ArrayList<>(oldOrderIds);
    }

    public List<Integer> getOngoingOrderIds() {
        return new ArrayList<>(ongoingOrderIds);
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }
    
//    public int getSurplusOrdersByCustomerId() {
//    int surplusCount = 0;
//
//        // Iterate through the list of old orders
//        for (int orderId : oldOrderIds) {
//            Order order = DataManager.
//            // Check if the order's selling price is above the target price
//            if (DataManager.isOrderAboveTargetPrice(orderId)) {
//                surplusCount++;
//            }
//        }
//
//        return surplusCount;
//    }
    // Additional methods as needed
}
