package com.devnom.service;

import com.devnom.model.*;

public class AppService {
    public static void updateInventory(String hatType, String color, double amount) {
        for(int i = 0; i < amount; i++) {
            IHat hatInstance = createHatObject(hatType, color);

            HatInventory.hatCollection.get(hatType).addToInventory(hatInstance);

        }
    }

    public static IHat createHatObject(String hatType, String color) {
        switch (hatType) {
            case "Cowboy":
                return new CowboyHat(color);
            case "Beret":
                return new Beret(color);
        }

        return null;
    }
}
