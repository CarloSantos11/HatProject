package com.devnom.controller;



import com.devnom.model.CowboyHat;
import com.devnom.model.HatInventory;
import com.devnom.service.AppService;
import com.devnom.view.AppUI;

import java.util.Scanner;

public class AppController {


    public static void startApp(){
        String userInput = "";

        while(!userInput.equalsIgnoreCase("Q")){
            AppUI.openingMenu();
            inventoryOptions(getUserInput());
        }
    }

    // YOu could put this in a util folder
    public static String getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static String inventoryOptions (String option) {

        switch (option) {
            case "1":
                selectHatAddToInventory();
                break;
//            case "2":
            // Checking inventory
////                option = "2
//                selectedHat = new Beret(color);
////                break;
        }
        return option;
    }


    public static String getAmount(String option) {return option;}

    public static String removeAmt(String option) {return option;}

    public static void selectHatAddToInventory(){
        AppUI.addToInventoryMenu();
        String option = getUserInput();
        selectHat(option);
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

//    public static void removeHat(){
//       String option = getUserInput();
//        removeAmt(getUserInput());


    private static void selectHat(String option) {

        switch (option) {
            case "1":
                String color = AppController.pickColor();
                double amount = AppController.pickAmount();
                AppService.updateInventory("Cowboy", color, amount);
                HatInventory.print();
                break;

            case"Q":
                // Should execute the ability to quit
                break;
        }
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
                break;
        }
        return null;
    }

    private static int pickAmountAction(String option){
        switch (option){
            case "1":
               return 50;
            case "2":
                System.out.println("75 hats");
                break;
            case "3":
                System.out.println("100 hats");
                break;
            case "4":
                System.out.println("125 hats");
                break;
            case "Q":
                break;
        }
        return 0;
    }


//    public void addSpecialEdition(InventoryList hatList){
//        if(hatList.inventoryList.contains("hat with special editon"){
//            // prompt: do you want to buy a special edition
//        }
//    }

    public static void checkOut(){
        System.out.println("This method calculates cost and displays items purchased");
    }

}


