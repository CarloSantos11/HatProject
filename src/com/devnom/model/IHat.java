package com.devnom.model;

/**
 * This is an interface that creates a contract for what hats should be
 *
 * Abstract Classes:
 * Concrete Classes:
 * // detail what implements this interface
 */
public interface IHat {
    String getModelNumber();
    String getUpcSymbol();
    String getUpcPrefix();
    int getStartingCount();
    int getUpcSuffix();
    String getColor();
    String getMaterial();
    double getPrice();

    void setPrice(double price);
}
