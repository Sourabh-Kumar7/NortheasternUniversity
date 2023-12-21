/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.MarketModel;

/**
 *
 * @author Siddharth 
 */
import java.util.HashSet;
import java.util.Set;

/**
 * The Channel class represents a communication or distribution channel within a business.
 * Each channel has a unique auto-incrementing identifier, a name, and a description.
 * It also maintains a list of market IDs that it is associated with, allowing for
 * the addition and removal of these market associations.
 */
public class Channel {
    private static int nextId = 1; // Static variable for auto-incrementing ID

    private int channelId;
    private String name;
    private String description;
    private Set<Integer> marketIds; // Set of associated market IDs

    /**
     * Constructs a new Channel with the specified name and description.
     *
     * @param name The name of the channel.
     * @param description The description of the channel.
     */
    public Channel(String name, String description) {
        this.channelId = nextId++;
        this.name = name;
        this.description = description;
        this.marketIds = new HashSet<>();
    }

    /**
     * Adds a market ID to the channel's set of associated markets.
     *
     * @param marketId The market ID to be added.
     */
    public void addMarketId(int marketId) {
        marketIds.add(marketId);
    }

    /**
     * Removes a market ID from the channel's set of associated markets.
     *
     * @param marketId The market ID to be removed.
     * @return true if the market ID was successfully removed, false otherwise.
     */
    public boolean removeMarketId(int marketId) {
        return marketIds.remove(marketId);
    }

    // Getters and Setters
    public int getChannelId() {
        return channelId;
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

    public Set<Integer> getMarketIds() {
        return new HashSet<>(marketIds); // To prevent external modification
    }

    // Additional methods as needed
}
