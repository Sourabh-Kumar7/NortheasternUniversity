/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;

import OrderManagement.Order;
import ProductManagement.Product;
import ProductManagement.ProductSalesHistory;
import TheBusiness.MarketModel.Bundle;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.Personnel.Customer;
import TheBusiness.Personnel.MarketManager;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.SalesPerson;
import TheBusiness.Personnel.Supplier;
import java.util.*;

/**
 *
 * @author sourabhkumar
 */
public class DataManager {    
    public static Map<String, Person> usernamePersonMap = new HashMap<>(); //username to all Person

    public static Map<Integer, Person> personDirectory = new HashMap<>(); //person id to all Person
    public static Map<Integer, SalesPerson> salesPersonDirectory = new HashMap<>(); //person id to salesPerson
    public static Map<Integer, Supplier> supplierDirectory = new HashMap<>(); //person id to supplier
    public static Map<Integer, MarketManager> marketManagerDirectory = new HashMap<>(); //person id to market manager
    public static Map<Integer, Person> adminDirectory = new HashMap<>(); //person id to admin
    public static Map<Integer, Customer> customerDirectory = new HashMap<>(); //person id to customer
    
    public static Map<Integer, Product> productCatalog = new HashMap<>(); //product id to product
    public static Map<Integer, ProductSalesHistory> productSalesHistoryCatalog = new HashMap<>(); //product id to ProductSalesHistory

    public static Map<Integer, Market> marketCatalog = new HashMap<>(); //market id to market
    public static Map<Integer, Bundle> bundleCatalog = new HashMap<>(); //Bundle id to Bundle
    public static Map<Integer, Channel> channelDirectory = new HashMap<>(); //channel id to channel
    
    public static Map<Integer, Order> masterOrderList = new HashMap<>(); //order id to order
}


