/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductManagement;

/**
 *
 * @author sourabhkumar
 */
import java.util.ArrayList;
import java.util.List;

/**
 * The ProductSalesHistory class represents the sales history of a product.
 * It contains the product's unique identifier and a list of prices at which 
 * the product has been sold. Each time the product is sold, its selling price 
 * is recorded in this history.
 */
public class ProductSalesHistory {
    private int productId;
    private List<Double> soldPrices;

    /**
     * Constructs a ProductSalesHistory for a specific product.
     *
     * @param productId The unique identifier of the product.
     */
    public ProductSalesHistory(int productId) {
        this.productId = productId;
        this.soldPrices = new ArrayList<>();
    }

    /**
     * Records a sale of the product at the given price.
     *
     * @param soldPrice The price at which the product was sold.
     */
    public void recordSale(double soldPrice) {
        soldPrices.add(soldPrice);
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public List<Double> getSoldPrices() {
        return new ArrayList<>(soldPrices); // To ensure encapsulation
    }

    // Setters, if modification of productId is required
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Additional methods as needed
}

