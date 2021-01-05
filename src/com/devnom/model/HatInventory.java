package com.devnom.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This will contain an inventory of all our hatas
 */
public class HatInventory {
  public static Map<String, Inventory> hatCollection = new LinkedHashMap<String, Inventory>() {{
     put("Cowboy", new Inventory<>("Cowboy"));
     put("Beret", new Inventory("Beret"));
     put("Sunhat", new Inventory("Sunhat"));
  }};

  public static void updateInventory(String inventoryType, Inventory hatInventory) {
      hatCollection.put(inventoryType, hatInventory);
  }

  public static void print() { hatCollection.forEach((key,value)-> System.out.println(value));}

}
