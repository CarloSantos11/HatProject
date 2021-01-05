package com.devnom.model;

public class Beret extends Fixed  {
    private final String modelNumber = "BR3109";
    private final String UpcPrefix = "648252";
    private static int startingCount = 8467;
    private final String material = "Wool";

    private int upcSuffix;
    private String upcSymbol;
    private String color;

    public Beret(String color) {
        this.color = color;
        this.upcSuffix = startingCount;
        this.upcSymbol = UpcPrefix + upcSuffix;
        startingCount++;
    }


    public void setUpcSuffix(int upcSuffix) {
        this.upcSuffix = upcSuffix;
    }

    public void setUpcSymbol(String upcSymbol) {
        this.upcSymbol = upcSymbol;
    }


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
        return this.UpcPrefix;
    }

    @Override
    public String getStartingCount() {
        return this.getStartingCount();
    }

    public String getUpcSuffix() {
        return this.getStartingCount();
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return null;
    }

    @Override
    public String toString() {

        return getUpcSymbol() + " Beret Hat Color: " + this.getColor() + "\n";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
