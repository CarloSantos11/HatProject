package com.devnom;

import com.devnom.model.Beret;
import com.devnom.model.*;


public class Cache {
    public static void main(String[] args) {
        Inventory<CowboyHat> inventoryListOfCowboyHats = new Inventory("Cowboy");
        Inventory<Beret> inventoryListOfBerets = new Inventory<>("Beret");

        CowboyHat chat1 = new CowboyHat("Red");
        CowboyHat chat2 = new CowboyHat("Red");
        CowboyHat chat3 = new CowboyHat("Red");
        CowboyHat chat4 = new CowboyHat("Red");

        Beret b1 = new Beret("Green");
        Beret b2 = new Beret("Red");
        Beret b3 = new Beret("Blue");

        inventoryListOfCowboyHats.addToInventory(chat1);
        inventoryListOfCowboyHats.addToInventory(chat2);
        inventoryListOfCowboyHats.addToInventory(chat3);
        inventoryListOfCowboyHats.addToInventory(chat4);

        inventoryListOfBerets.addToInventory(b1);
        inventoryListOfBerets.addToInventory(b2);
        inventoryListOfBerets.addToInventory(b3);


        HatInventory.updateInventory("Cowboy", inventoryListOfCowboyHats);
        HatInventory.updateInventory("Beret", inventoryListOfBerets);

        HatInventory.print();
    }
}
