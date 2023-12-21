/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;
import ProductManagement.Product;
import TheBusiness.Personnel.Person;
import java.text.SimpleDateFormat;
import java.util.Date;
import DataManagement.DataManager;
import static DataManagement.DataManager.bundleCatalog;
import static DataManagement.DataManager.channelDirectory;
import static DataManagement.DataManager.customerDirectory;
import static DataManagement.DataManager.marketCatalog;
import static DataManagement.DataManager.marketManagerDirectory;
import static DataManagement.DataManager.personDirectory;
import static DataManagement.DataManager.productCatalog;
import static DataManagement.DataManager.salesPersonDirectory;
import static DataManagement.DataManager.supplierDirectory;
import static DataManagement.DataManager.usernamePersonMap;
import OrderManagement.Order;
import ProductManagement.ProductSalesHistory;
import TheBusiness.MarketModel.Bundle;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.Personnel.Customer;
import TheBusiness.Personnel.MarketManager;
import TheBusiness.Personnel.SalesPerson;
import TheBusiness.Personnel.Supplier;
import Utils.HashingUtil;
import java.text.ParseException;
import java.util.Map;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author mac
 */
public class DataLoader {
    
    
   public void Jsonloaderfunction() throws ParseException{
       try (JsonReader jsonReader = Json.createReader(new FileReader("resources/data/dataLoader.json"))) {
            JsonObject dataDirectory = jsonReader.readObject();

            // Initialize objects
            initializeSuppliers(dataDirectory.getJsonArray("Supplier Owner"));
            initializeMarketingPersons(dataDirectory.getJsonArray("Marketing Person"));
            initializeSalesPersons(dataDirectory.getJsonArray("Sales Person"));
            initializeCustomers(dataDirectory.getJsonArray("Customer"));
            generateFakeOrdersForCustomers();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
         printData();
        
   }


    private static void initializeSuppliers(JsonArray supplierArray) throws ParseException {
        for (JsonObject supplierObject : supplierArray.getValuesAs(JsonObject.class)) {
            // Initialize Person
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            JsonObject userDetails = supplierObject.getJsonObject("userDetails");
            String name = userDetails.getString("name");
            String gender = userDetails.getString("gender");
            String email = userDetails.getString("email");
            Date dateOfBirth = dateFormat.parse(userDetails.getString("dateOfBirth"));
            String username = userDetails.getString("username");
            String password = userDetails.getString("password");
            String userType = userDetails.getString("userType");
            String phoneNumber = userDetails.getString("phoneNumber");
            String hashedPassword = HashingUtil.hashString(password);
            Person person = new Person(name,email,gender,dateOfBirth,username,hashedPassword,userType,phoneNumber);
            usernamePersonMap.put(person.getUsername(), person);
            personDirectory.put(person.getPersonId(), person);
            
            // Initialize Supplier
            Supplier supplier = new Supplier(person.getPersonId());
            supplierDirectory.put(person.getPersonId(),supplier);   
            
            // Initialize Product Catalog
            JsonArray productCatalog = supplierObject.getJsonArray("productCatalog");
            for (JsonObject productObject : productCatalog.getValuesAs(JsonObject.class)) {
                // Initialize Product (Assuming you have a Product class)
                
                String productname = productObject.getString("name");
                Double floorPrice = (productObject.getJsonNumber("floorPrice").doubleValue());
                Double ceilingPrice = (productObject.getJsonNumber("ceilingPrice").doubleValue());
                Double targetPrice = (productObject.getJsonNumber("targetPrice").doubleValue());
                String productdescription = (productObject.getString("description"));
                int quantity = (productObject.getInt("quantity"));
                Product product = new Product(productname, floorPrice, ceilingPrice, targetPrice, productdescription, quantity, -1);
           
                supplier.addProductId(product.getId());
                DataManager.productCatalog.put(product.getId(),product);
                ProductSalesHistory productSalesHistory = new ProductSalesHistory(product.getId());
                DataManager.productSalesHistoryCatalog.put(product.getId(), productSalesHistory);
            }

            // Output for verification
            System.out.println("Initialized Supplier with username: " + username);
        }
    }

    

    private static void initializeMarketingPersons(JsonArray marketingPersonArray) throws ParseException {
        for (JsonObject marketingPersonObject : marketingPersonArray.getValuesAs(JsonObject.class)) {
            // Initialize Person
            JsonObject userDetails = marketingPersonObject.getJsonObject("userDetails");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String name = userDetails.getString("name");
            String gender = userDetails.getString("gender");
            String email = userDetails.getString("email");
            Date dateOfBirth = dateFormat.parse(userDetails.getString("dateOfBirth"));
            String username = userDetails.getString("username");
            String password = userDetails.getString("password");
            String userType = userDetails.getString("userType");
            String phoneNumber = userDetails.getString("phoneNumber");
            String hashedPassword = HashingUtil.hashString(password);
            Person person = new Person(name, email, gender, dateOfBirth, username, hashedPassword, userType, phoneNumber);
            usernamePersonMap.put(person.getUsername(), person);
            personDirectory.put(person.getPersonId(), person);

            // Initialize MarketingPerson
            MarketManager marketingPerson = new MarketManager(person.getPersonId());
            marketManagerDirectory.put(marketingPerson.getPersonId(), marketingPerson);

            // Initialize Channels
            JsonArray channelsArray = marketingPersonObject.getJsonArray("channels");
            for (JsonObject channelObject : channelsArray.getValuesAs(JsonObject.class)) {
                String channelName = channelObject.getString("name");
                String channelDescription = channelObject.getString("description");
                Channel channel = new Channel(channelName, channelDescription);

                // Add channel to MarketingPerson
                marketingPerson.addChannelId(channel.getChannelId());
                channelDirectory.put(channel.getChannelId(), channel);

                // Output for verification
                System.out.println("Initialized Channel: " + channel);
            }

            // Initialize Markets
            JsonArray marketsArray = marketingPersonObject.getJsonArray("markets");
            for (JsonObject marketObject : marketsArray.getValuesAs(JsonObject.class)) {
                String marketName = marketObject.getString("name");
                String marketDescription = marketObject.getString("description");
                Market market = new Market(marketName, marketDescription);

                // Add market to MarketingPerson
                marketingPerson.addMarketId(market.getId());
                marketCatalog.put(market.getId(), market);

                // Assign random channels to the market (3-5 channels)
                assignRandomChannelsToMarket(market, 3, 5);

                // Create 10-15 bundles for the market, each with 5-7 randomly added products
                createBundlesForMarket(market, 10, 15, 5, 7);

                // Output for verification
                System.out.println("Initialized Market: " + market);
            }

            // Output for verification
            System.out.println("Initialized MarketingPerson: " + marketingPerson);
        }
    }

    private static void assignRandomChannelsToMarket(Market market, int minChannels, int maxChannels) {
        List<Integer> channelIds = new ArrayList<>(channelDirectory.keySet());
        Collections.shuffle(channelIds);

        int numChannels = ThreadLocalRandom.current().nextInt(minChannels, maxChannels + 1);
        for (int i = 0; i < numChannels && i < channelIds.size(); i++) {
            int channelId = channelIds.get(i);
            market.addChannel(channelId);
            Channel channel = DataManager.channelDirectory.get(channelId);
            channel.addMarketId(market.getId());
        }
    }

    private static void createBundlesForMarket(Market market, int minBundles, int maxBundles, int minProducts, int maxProducts) {
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(minBundles, maxBundles + 1); i++) {
            Bundle bundle = new Bundle("Bundle " + i, "Description for Bundle " + i, market.getId());

            // Add randomly selected products to the bundle (5-7 products)
            List<Integer> productIds = new ArrayList<>(productCatalog.keySet());
            Collections.shuffle(productIds);
            int numProducts = ThreadLocalRandom.current().nextInt(minProducts, maxProducts + 1);
            for (int j = 0; j < numProducts && j < productIds.size(); j++) {
                bundle.addProductId(productIds.get(j));
            }

            // Add the bundle to the market
            market.addBundle(bundle.getId());
            bundleCatalog.put(bundle.getId(), bundle);

            // Output for verification
            System.out.println("Initialized Bundle: " + bundle);
        }
    }
    
    private static void initializeSalesPersons(JsonArray salesPersonArray) throws ParseException {
        for (JsonObject salesPersonObject : salesPersonArray.getValuesAs(JsonObject.class)) {
            // Initialize Person
            JsonObject userDetails = salesPersonObject.getJsonObject("userDetails");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String name = userDetails.getString("name");
            String gender = userDetails.getString("gender");
            String email = userDetails.getString("email");
            Date dateOfBirth = dateFormat.parse(userDetails.getString("dateOfBirth"));
            String username = userDetails.getString("username");
            String password = userDetails.getString("password");
            String userType = userDetails.getString("userType");
            String phoneNumber = userDetails.getString("phoneNumber");
            String hashedPassword = HashingUtil.hashString(password);
            Person person = new Person(name,email,gender,dateOfBirth,username,hashedPassword,userType,phoneNumber);
            usernamePersonMap.put(person.getUsername(), person);
            personDirectory.put(person.getPersonId(), person);

            // Initialize SalesPerson
            SalesPerson salesPerson = new SalesPerson(person.getPersonId());
            
            DataManager.salesPersonDirectory.put(person.getPersonId(),salesPerson);

            // Output for verification
            System.out.println("Initialized SalesPerson: " + salesPerson);
        }
    }
    
    private static void initializeCustomers(JsonArray customerArray) throws ParseException {
        List<Integer> channelIds = new ArrayList<>(channelDirectory.keySet());

        for (JsonObject customerObject : customerArray.getValuesAs(JsonObject.class)) {
            // Initialize Person
            JsonObject userDetails = customerObject.getJsonObject("userDetails");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String name = userDetails.getString("name");
            String gender = userDetails.getString("gender");
            String email = userDetails.getString("email");
            Date dateOfBirth = dateFormat.parse(userDetails.getString("dateOfBirth"));
            String username = userDetails.getString("username");
            String password = userDetails.getString("password");
            String userType = userDetails.getString("userType");
            String phoneNumber = userDetails.getString("phoneNumber");
            String hashedPassword = HashingUtil.hashString(password);
            Person person = new Person(name, email, gender, dateOfBirth, username, hashedPassword, userType, phoneNumber);
            usernamePersonMap.put(person.getUsername(), person);
            personDirectory.put(person.getPersonId(), person);

            // Initialize Customer
            Customer customer = new Customer(person.getPersonId(), -1);

            // Randomly assign one channel from existing channels
            if (!channelIds.isEmpty()) {
                int randomIndex = ThreadLocalRandom.current().nextInt(channelIds.size());
                int randomChannelId = channelIds.get(randomIndex);
                customer.setChannelId(randomChannelId);
            }

            customerDirectory.put(person.getPersonId(), customer);

            // Output for verification
            System.out.println("Initialized Customer: " + customer);
        }
    }
    
    // Helper method to get a random element from a set
    private static int getRandomElement(Set<Integer> set) {
        int size = set.size();
        int item = new Random().nextInt(size);
        int i = 0;
        for (int element : set) {
            if (i == item) {
                return element;
            }
            i++;
        }
        return -1; // Should not reach here
    }

    public static void generateFakeOrdersForCustomers() {
        Random random = new Random();

        // Iterate through each customer
        for (Customer customer : DataManager.customerDirectory.values()) {
            int numberOfOrders = random.nextInt(6) + 15; // Generate between 15 and 20 orders

            // Generate fake orders for the customer
            for (int i = 0; i < numberOfOrders; i++) {
                // Randomly assign a salesperson
                int randomSalesPersonId = getRandomElement(DataManager.salesPersonDirectory.keySet());

                // Fetch market IDs associated with the customer's channel
                int channelId = customer.getChannelId();
                Channel customerChannel = DataManager.channelDirectory.get(channelId);
                
                Set<Integer> channelMarketIds = customerChannel.getMarketIds();
                int randomMarketId = getRandomElement(channelMarketIds);

                // Fetch the market
                Market selectedMarket = DataManager.marketCatalog.get(randomMarketId);

                // Fetch bundles within the selected market
                Set<Integer> marketBundleIds = selectedMarket.getBundles();

                // Select a random bundle from the list
                int randomBundleId = getRandomBundleId(marketBundleIds);

                // Set final customer status and salesperson status
                String finalCustomerStatus = "Deal"; // You can modify this as needed
                String salesPersonStatus = "Sold"; // You can modify this as needed
                Bundle bundle = DataManager.bundleCatalog.get(randomBundleId);
                // Generate a random increase in price between 0.6 and 1.8
                Double randomIncreaseInPrice = ThreadLocalRandom.current().nextDouble(0.6, 1.8);

                Double sellingPrice = bundle.getTargetPrice()*randomIncreaseInPrice;
                // Create a fake order and set the necessary details
                Order fakeOrder = new Order(customer.getPersonId(), randomBundleId, randomSalesPersonId, sellingPrice, bundle.getTargetPrice());
                fakeOrder.setOrderStatus("Done");
                fakeOrder.setCustomerOrderStatus(finalCustomerStatus);
                fakeOrder.setSalesPersonStatus(salesPersonStatus);
                
                SalesPerson salesPerson = DataManager.salesPersonDirectory.get(randomSalesPersonId);
                salesPerson.addCompletedOrderId(fakeOrder.getId());
                customer.addOldOrderId(fakeOrder.getId());

                // Update product quantities (assuming each order is for one unit)
                
                for (int productId : bundle.getProductIds()) {
                    ProductSalesHistory pproductSalesHistory = DataManager.productSalesHistoryCatalog.get(productId);
                    pproductSalesHistory.recordSale(sellingPrice);
                }

                // Update bundle selling prices and history
                bundle.Sold(fakeOrder.getSellingPrice());
                DataManager.bundleCatalog.put(randomBundleId, bundle);
                DataManager.masterOrderList.put(fakeOrder.getId(), fakeOrder);

                // Increment total sales and profit in the market
                selectedMarket.incrementTotalSales();
                selectedMarket.incrementTotalProfit(fakeOrder.getSellingPrice());
            }
        }

        System.out.println("Fake orders generated successfully!");
    }
    
    private static int getRandomBundleId(Set<Integer> marketBundleIds) {
        if (marketBundleIds.isEmpty()) {
            throw new IllegalStateException("Cannot get a random bundle ID from an empty set.");
        }

        List<Integer> bundleIdsList = new ArrayList<>(marketBundleIds);
        int randomIndex = new Random().nextInt(bundleIdsList.size());
        return bundleIdsList.get(randomIndex);
    }


    private static void printData() {
        System.out.println("Person Catalog:");
        printPersonDirectory(personDirectory);

        System.out.println("\nSales Person Catalog:");
        printSalesPersonDirectory(salesPersonDirectory);

        System.out.println("\nSupplier Catalog:");
        printSupplierDirectory(supplierDirectory);

        System.out.println("\nMarket Manager Catalog:");
        printMarketManagerDirectory(marketManagerDirectory);

        System.out.println("\nCustomer Catalog:");
        printCustomerDirectory(customerDirectory);
    }
    
       
    private static void printPersonDirectory(Map<Integer, Person> catalog) {
        for (Map.Entry<Integer, Person> entry : catalog.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Person: " + entry.getValue());
        }
    }
    
    private static void printSupplierDirectory(Map<Integer, Supplier> catalog) {
            for (Map.Entry<Integer, Supplier> entry : catalog.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Supplier Owner: " + entry.getValue());
            Set<Integer> productIds = entry.getValue().getProductIds();
            System.out.println("Product IDs: " + productIds);
        }
    }
     
    private static void printSalesPersonDirectory(Map<Integer, SalesPerson> catalog) {
            for (Map.Entry<Integer, SalesPerson> entry : catalog.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Sales Person: " + entry.getValue());
        }
    }
     
    private static void printMarketManagerDirectory(Map<Integer, MarketManager> catalog) {
        for (Map.Entry<Integer, MarketManager> entry : catalog.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Marketing Manager: " + entry.getValue());
            System.out.println("Markets:");
            Set<Integer> MarketIds = entry.getValue().getMarketIds();
            System.out.println("Markets: " + MarketIds);
            System.out.println("Channels:");
            Set<Integer> ChannelIds = entry.getValue().getChannelIds();
            System.out.println("Channel: " + ChannelIds);
        }
    }
       
    private static void printCustomerDirectory(Map<Integer, Customer> catalog) {
        for (Map.Entry<Integer, Customer> entry : catalog.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Customer: " + entry.getValue());
        }
    }
}
