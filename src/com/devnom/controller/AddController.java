package com.devnom.controller;

import com.devnom.service.AppService;
import com.devnom.view.AppUI;

import static com.devnom.util.Helper.getUserInput;

public class AddController {

    public static void selectHat(String hatType, String color, double amount) {
        switch (hatType) {
            case "1":
                AppService.updateInventory("Cowboy", color, amount);
                break;
            case "2":
                AppService.updateInventory("Beret", color, amount);
                break;
            case"Q":
                System.exit(0);
                break;
        }
    }

    public static void addToInventory(){
        AppUI.addToInventoryMenu();
        String option = getUserInput();
        String color = pickColor();
        double amount = pickAmount();
        selectHat(option, color, amount);
    }

    public static String pickColor(){
        AppUI.pickColorMenu();
        String option = getUserInput();
        return pickColorAction(option);
    }

    public static double pickAmount(){
        AppUI.pickAmountMenu();
        String option = getUserInput();
        return pickAmountAction(option);
    }

    private static String pickColorAction(String option){
        switch (option){
            case "1":
                return "Red";
            case "2":
                return "Green";
            case "3":
                return "Blue";
            case "4":
                return "Black";
            case "Q":
                System.exit(0);
                break;
        }
        return null;
    }

    private static int pickAmountAction(String option){
        switch (option){
            case "1":
                return 5;
            case "2":
                return 10;
            case "3":
                return 25;
            case "4":
                return 100;
            case "Q":
                System.exit(0);
                break;
        }
        return 0;
    }
}
