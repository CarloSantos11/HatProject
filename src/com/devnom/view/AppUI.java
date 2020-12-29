package com.devnom.view;

public class AppUI {

    public static void  openingMenu() {
        System.out.println(
        "*************************************** \n" +
                "       Welcome To The Hat App\n" +
                "*************************************** \n" +
                "\t1. Add items to inventory\n" +
                "\t2. Check ItemInventory\n" +
                "\t3. Fulfill Order\n" +
                "\t4. Restock inventory \n" +

                "\t\tQ to exit...\n"
        );
    }
    public static void addToInventoryMenu() {
        System.out.println(
                "*************************************** \n" +
                        "       Types of Hats\n" +
                        "*************************************** \n" +
                        "\t1. Cowboy\n\n" +

                        "\t2. Beret\n" +


                        "\t3. Visor\n\n" +
                        "\t4. Trucker\n\n" +

                        "\t5. Sun\n" +
                        "\t6. Sport \n" +


                        "\tQ to exit...\n"
        );
    }


    public static void pickColorMenu(){
        System.out.println(
                "---------------------------------------------------------\n" +
                        "                  Pick a color for your hat             \n " +
                        "---------------------------------------------------------\n" +
                        " 1. Red \n" +
                        " 2. Green \n" +
                        " 3. Blue \n" +
                        " 4. Black \n" +
                        "Q to exit"
        );
    }
}
