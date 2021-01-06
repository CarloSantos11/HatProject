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
    private String hatType;
    private ArrayList<T> hatList;

    public Inventory(String hatType) {
        this.hatType = hatType;
        hatList = new ArrayList<>();
    }

    public void addToInventory(T hat) {
        hatList.add(hat);
    }

    public ArrayList<T> getHatList() {
        return this.hatList;
    }

    public String getCategory() {
        return this.hatType;
    }

    public int getCount() {
        return this.hatList.size();
    }

    @Override
    public String toString() {
        return getCategory() + ": Total Count(" + getCount() + ")";
    }

    public void printInventoryDetails() {
        System.out.println("***********************");
        System.out.println(this);
        for (T item : hatList) {
            System.out.println(item);
        }
        System.out.println("***********************");
    }
}
