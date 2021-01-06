package com.devnom.model;

public class CowboyHat extends Fixed {
    private final String modelNumber = "CB3319";
    private final String upcPrefix = "901352";
    private static int startingCount = 9573;
    private final String material = "Beaver";

    private int upcSuffix;
    private String upcSymbol;
    private String color;

    public CowboyHat(String color) {
        this.color = color;
        this.upcSuffix = getStartingCount();
        this.upcSymbol = getModelNumber() + getUpcPrefix() + getUpcSuffix();
        startingCount++;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String getModelNumber() {
        return this.modelNumber;
    }

    @Override
    public String getUpcSymbol() {
        return this.upcSymbol;
    }

    @Override
    public String getUpcPrefix() {
        return this.upcPrefix;
    }

    @Override
    public int getStartingCount() {
        return this.startingCount;
    }

    public int getUpcSuffix() {
        return this.upcSuffix;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
