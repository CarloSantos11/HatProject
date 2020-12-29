package com.devnom.model;

import java.util.ArrayList;

/**
 * This holds the inventory of each hat
 *
 * A list of these will compose our actual factory inventory
 *
 * @param <T>
 */
public class Inventory <T extends IHat> {
    private String hatCategory;
    private ArrayList<T> inventoryList;

    public Inventory(String hatCategory) {
        this.hatCategory = hatCategory;
        inventoryList = new ArrayList<>();
    }

        public void addToInventory(T hat) {
        inventoryList.add(hat);
    }

    public ArrayList<T> getInventoryList() {
        return this.inventoryList;
    }

    public String getCategory() {
        return this.hatCategory;
    }

    public int getCount() {
        return this.inventoryList.size();
    }

    @Override
    public String toString() {
        System.out.println(getCategory() + ": Total Count(" + getCount() + ")");
        for (T item : inventoryList) {
            System.out.println(item);
        }
        System.out.println();
        return "";
    }
}
