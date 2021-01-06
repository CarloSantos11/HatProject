package com.devnom.controller;

import com.devnom.model.HatInventory;
import com.devnom.view.AppUI;
import static com.devnom.util.Helper.*;

public class CheckInventoryController {

    public static void checkInventory(){
        AppUI.listInventroyMenu();
        String option = getUserInput();
        selectInventoryCheck(option);
    }

    private static void selectInventoryCheck(String option) {
        switch (option) {
            case "1":
                //cowboy hats
                HatInventory.print("Cowboy");
                break;
            case "2":
                HatInventory.print("Beret");
                break;
            case "3":
                //sunhats
                break;
            case "4":
                HatInventory.fullPrint();
                break;
        }
    }
}
