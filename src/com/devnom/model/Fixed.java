package com.devnom.model;

public abstract class Fixed implements IHat {
    boolean handStitched = true;
    boolean handWashed = true;
    boolean logoInside = true;
    boolean extraLogo = false;
    boolean specialEdition = false;
    double price;

    @Override
    public String toString() {
        return this.getUpcSymbol();
    }
}
