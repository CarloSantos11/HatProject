package com.devnom.model;

public abstract class Fixed implements IHat {
    boolean handStitched = true;
    boolean handWashed = true;
    boolean logoInside = true;
    boolean extraLogo = false;
    boolean specialEdition = false;

    protected String modelNumber;
    protected  String upcPrefix;
    protected static int startingCount;
    protected String material;

    protected int upcSuffix;
    protected String upcSymbol;
    protected String color;
    double price;

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

    @Override
    public String toString() {
        return "UPC Symbol: " + getUpcSymbol() +
                "\nMaterial: " + getMaterial() +
                "\nLogo Visible: " + !logoInside +
                "\nColor: " + getColor() + "\n";
    }
}
