/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductManagement;

/**
 *
 * @author sourabhkumar
 */
/**
 * The Product class represents a product with pricing and descriptive information.
 * It includes the product's name, its floor price (lowest price), ceiling price (highest price),
 * target price, and a description.
 */
public class Product {
    private static int nextProductId = 1; // Static variable for auto-incrementing ID
    private int productId;
    private String name;
    private double floorPrice;
    private double ceilingPrice;
    private double targetPrice;
    private int quantity;
    private String description;
    private int supplierId;

    /**
     * Constructs a new Product with the specified details.
     *
     * @param name The name of the product.
     * @param floorPrice The lowest price of the product.
     * @param ceilingPrice The highest price of the product.
     * @param targetPrice The target price of the product.
     * @param description The description of the product.
     */
    public Product(String name, double floorPrice, double ceilingPrice, double targetPrice, String description, int quantity, int supplierId) {
        this.productId = nextProductId++; // Assign and increment the product ID
        this.name = name;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        this.description = description;
        this.quantity = quantity;
        this.supplierId = supplierId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // Getters and Setters
    public int getProductId() {
        return productId;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }
    
      public int getId() {
        return productId;
    }
      

    public void setName(String name) {
        this.name = name;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public double getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(double ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    // Additional methods as needed
}
