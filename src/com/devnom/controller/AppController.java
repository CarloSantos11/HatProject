package com.devnom.controller;

import com.devnom.view.AppUI;
import static com.devnom.util.Helper.getUserInput;

public class AppController {
    public static void startApp(){
        while(true){
            AppUI.openingMenu();
            inventoryOptions(getUserInput());
        }
    }

    public static void inventoryOptions (String option) {

        switch (option) {
            case "1":
                AddController.addToInventory();
                break;
            case "2":
                CheckInventoryController.checkInventory();
                break;
            case "3":
                //Fullfill order
            case "Q":
            case "q":
                System.exit(0);
        }
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


