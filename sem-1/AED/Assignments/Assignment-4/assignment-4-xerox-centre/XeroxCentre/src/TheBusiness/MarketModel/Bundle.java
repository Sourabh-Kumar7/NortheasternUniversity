/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.MarketModel;

import DataManagement.DataManager;
import ProductManagement.Product;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author sourabhkumar
 */

/**
 * The Bundle class represents a collection of products grouped together as a package within a market.
 * Each bundle has a unique auto-incrementing identifier, a name, a description, and is associated with a market.
 * It maintains a list of product IDs that are included in the bundle, providing functionality to add and remove products.
 */
public class Bundle {
    private static int nextId = 1; // Static variable for auto-incrementing ID

    private int id;
    private String name;
    private String description;
    private int marketId; // The ID of the market to which this bundle is part
    private Set<Integer> productIds; // Set of product IDs included in the bundle
    private List<Double> sellingPrices;
    private Double highestSellingPrice;
    private int targetPrice;

    /**
     * Constructs a new Bundle with the specified name, description, and market ID.
     *
     * @param name The name of the bundle.
     * @param description The description of the bundle.
     * @param marketId The ID of the market to which this bundle belongs.
     */
    public Bundle(String name, String description, int marketId) {
        this.id = nextId++;
        this.name = name;
        this.description = description;
        this.marketId = marketId;
        this.productIds = new HashSet<>();
        this.sellingPrices = new ArrayList<>();
        this.targetPrice = 0;
        this.highestSellingPrice = 0.0;
    }

    /**
     * Adds a product ID to the bundle.
     *
     * @param productId The product ID to be added to the bundle.
     */
    public void addProductId(int productId) {
        productIds.add(productId);
        Product product = DataManager.productCatalog.get(productId);
        targetPrice += product.getTargetPrice();
    }

    public void Sold(Double sellingPrice) {
        sellingPrices.add(sellingPrice);
        if(sellingPrice> highestSellingPrice)highestSellingPrice = sellingPrice;
    }

    public List<Double> getSellingPrices() {
        return new ArrayList<>(sellingPrices);
    }

    public int getTargetPrice() {
        return targetPrice;
    }
    
    public Double getHighestSellingPrice(){
        return highestSellingPrice;
    }
    
    /**
     * Removes a product ID from the bundle.
     *
     * @param productId The product ID to be removed from the bundle.
     * @return true if the product ID was successfully removed, false otherwise.
     */
    public boolean removeProductId(int productId) {
        Product product = DataManager.productCatalog.get(productId);
        targetPrice -= product.getTargetPrice(); 
        return productIds.remove(productId);
        
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public Set<Integer> getProductIds() {
        return new HashSet<>(productIds); // To prevent external modification
    }

    // Additional methods as needed

    public void setProductIds(Set<Integer> productIds) {
        this.productIds = productIds;
    }
}

