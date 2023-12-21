package TheBusiness.MarketModel;

import java.util.HashSet;
import java.util.Set;

/**
 * The Market class represents a market entity.
 * It includes an automatically incrementing ID, a name, a description,
 * a list of product bundles, and a list of customer channels.
 * Product bundles represent groups of products offered in the market,
 * and customer channels represent various ways customers can engage with the market.
 */
public class Market {
    private static int nextId = 1;

    private int id;
    private String name;
    private String description;
    private Set<Integer> bundles; // Each bundle is a set of product IDs
    private Set<Integer> channels; // Channels through which customers can come to the market
    private int totalSales;
    private double totalProfit;

    public Market(String name, String description) {
        this.id = nextId++;
        this.name = name;
        this.description = description;
        this.bundles = new HashSet<>();
        this.channels = new HashSet<>();
        this.totalProfit = 0.0;
        this.totalSales = 0;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public void incrementTotalSales() {
        this.totalSales += 1;
    }

    public void incrementTotalProfit(double profit) {
        this.totalProfit += profit;
    }

    // Add a new bundle of products
    public void addBundle(Integer productId) {
        bundles.add(productId);
    }

    // Remove a bundle of products
    public boolean removeBundle(Integer productId) {
        return bundles.remove(productId);
    }

    // Add a new customer channel
    public void addChannel(Integer channel) {
        channels.add(channel);
    }

    // Remove a customer channel
    public boolean removeChannel(Integer channel) {
        return channels.remove(channel);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<Integer> getBundles() {
        return new HashSet<>(bundles); // To ensure encapsulation
    }

    public Set<Integer> getChannels() {
        return new HashSet<>(channels); // To ensure encapsulation
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Additional methods as needed

    public void setChannels(Set<Integer> channels) {
        this.channels = channels;
    }
}
