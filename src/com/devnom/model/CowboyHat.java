package com.devnom.model;

public class CowboyHat extends Fixed {
    private final String modelNumber = "CB3319";
    private final String UpcPrefix = "901352";
    private static int startingCount = 9573;
    private final String material = "Beaver";

    private int upcSuffix;
    private String upcSymbol;
    private String color;

    public CowboyHat(String color) {
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
        return null;
    }

    @Override
    public String getMaterial() {
        return null;
    }

    @Override
    public String toString() {
        return "CowboyHat{\n" +
                "modelNumber='" + modelNumber + '\n' +
                ", material='" + material + '\n' +
                ", upcSymbol='" + upcSymbol + '\n' +
                ", color='" + color + '\n' +
                ", handStitched='" + handStitched + '\n' +
                ", handWashable='" + handWashed + '\n' +
                '}';
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
