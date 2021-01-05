package com.devnom.model;

/**
 * Add Documentation
 */
public abstract class Adjustable implements IHat {
    boolean handStitched = false;
    boolean handWashed = false;
    boolean logoInside = false;
    boolean extraLogo = false;
    boolean specialEdition = false;
    double price;

    @Override
    public String toString() {
        return this.getUpcSymbol();
    }
}
