package TheBusiness.Personnel;

import java.util.HashSet;
import java.util.Set;

/**
 * The MarketManager class represents a manager in charge of various markets and channels.
 * Each MarketManager is associated with a unique person identifier.
 * This class allows for managing sets of market IDs and channel IDs, which the manager can add to or remove from.
 *
 * The use of Sets for market IDs and channel IDs ensures that each ID is unique and prevents duplicates.
 */
public class MarketManager {
    private int personId;
    private Set<Integer> marketIds;
    private Set<Integer> channelIds; // Additional field for managing channel IDs

    /**
     * Constructs a MarketManager with the specified person ID.
     * 
     * @param personId The unique identifier of the MarketManager.
     */
    public MarketManager(int personId) {
        this.personId = personId;
        this.marketIds = new HashSet<>();
        this.channelIds = new HashSet<>(); // Initialize the set for channel IDs
    }

    // Method to add a market ID
    public void addMarketId(int marketId) {
        marketIds.add(marketId);
    }

    // Method to remove a market ID
    public boolean removeMarketId(int marketId) {
        return marketIds.remove(marketId);
    }

    // Method to add a channel ID
    public void addChannelId(int channelId) {
        channelIds.add(channelId);
    }

    // Method to remove a channel ID
    public boolean removeChannelId(int channelId) {
        return channelIds.remove(channelId);
    }

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Set<Integer> getMarketIds() {
        return new HashSet<>(marketIds); // To prevent external modification
    }

    public Set<Integer> getChannelIds() {
        return new HashSet<>(channelIds); // To prevent external modification
    }

    // Additional methods as needed for business logic
}
