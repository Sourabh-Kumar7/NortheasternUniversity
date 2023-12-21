/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package OrderManagement;


/** *
 * @author Siddharth
 */

/**
 * The Order class represents a customer order in a business context.
 * It includes an auto-incrementing ID and details such as bundle ID, customer ID,
 * salesperson ID, customer and salesperson statuses, selling and target prices,
 * and overall order status. It provides functionality to calculate metrics related
 * to the order and to check if the selling price is above the target price.
 */
public class Order {
    private static int nextId = 1; // Static variable for auto-incrementing ID

    private int id;
    private int bundleId;
    private int customerId;
    private int salesPersonId;
    private String customerOrderStatus;
    private double sellingPrice;
    private double targetPrice;
    private String salesPersonStatus;
    private String orderStatus;

    /**
     * Constructs a new Order with specified details.
     *
     * @param bundleId The ID of the bundle associated with the order.
     * @param customerId The ID of the customer placing the order.
     * @param salesPersonId The ID of the salesperson handling the order.
     * @param sellingPrice The selling price of the order.
     * @param targetPrice The target price of the order.
     */
    public Order(int bundleId, int customerId, int salesPersonId, double sellingPrice, double targetPrice) {
        this.id = nextId++;
        this.bundleId = bundleId;
        this.customerId = customerId;
        this.salesPersonId = salesPersonId;
        this.sellingPrice = sellingPrice;
        this.targetPrice = targetPrice;
        this.customerOrderStatus = "I want to buy"; // Default status
        this.salesPersonStatus = "Sales Person is not alloted"; // Default status
        this.orderStatus = "Processing"; // Default status
    }
    
    /**
     * Calculates the profit or loss made on the order relative to the target price.
     *
     * @return The difference between the selling price and the target price.
     */
    public double calculateProfitLoss() {
        return sellingPrice - targetPrice;
    }

    /**
     * Calculates the percentage difference from the target price.
     *
     * @return The percentage difference relative to the target price.
     */
    public double calculatePercentageDifference() {
        if (targetPrice == 0) {
            return 0; // Avoid division by zero
        }
        return ((sellingPrice - targetPrice) / targetPrice) * 100;
    }

    /**
     * Calculates the profit percentage if there is a profit, otherwise returns 0.
     *
     * @return The profit percentage relative to the target price, or 0 if there is no profit.
     */
    public double calculateProfitPercentage() {
        if (sellingPrice > targetPrice && targetPrice > 0) {
            return ((sellingPrice - targetPrice) / targetPrice) * 100;
        }
        return 0;
    }

    /**
     * Checks if the selling price of the order is above the target price.
     *
     * @return true if the selling price is higher than the target price, false otherwise.
     */
    public boolean isSellingPriceAboveTarget() {
        return sellingPrice > targetPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public int getBundleId() {
        return bundleId;
    }

    public void setBundleId(int bundleId) {
        this.bundleId = bundleId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getCustomerOrderStatus() {
        return customerOrderStatus;
    }

    public void setCustomerOrderStatus(String customerOrderStatus) {
        this.customerOrderStatus = customerOrderStatus;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getSalesPersonStatus() {
        return salesPersonStatus;
    }

    public void setSalesPersonStatus(String salesPersonStatus) {
        this.salesPersonStatus = salesPersonStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    // Additional methods as needed for business logic
}
