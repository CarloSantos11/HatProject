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
                        "\t1. Cowboy\n" +
                        "\t2. Beret\n" +
                        "\t3. Visor\n" +
                        "\t4. Trucker\n" +
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
                        "Q to exit..."
        );
    }

    public static void pickAmountMenu(){
        System.out.println(
                "-------------------------------------------------------\n"+
                "                 Select amount                         \n" +
                "-------------------------------------------------------\n"+
                        "1. 5 \n" +
                        "2. 10 \n" +
                        "3. 25 \n" +
                        "4. 100 \n" +
                        "Q to exit ..."
        );
    }

    public static void listInventroyMenu(){
        System.out.println(
                "-------------------------------------------------------\n"+
                "           Select An Invetory Item To Print            \n" +
                "-------------------------------------------------------\n"+
                        "1. Cowboy Hats \n" +
                        "2. Berets \n" +
                        "3. Sun Hats \n" +
                        "4. Print All \n" +
                        "Q to exit ..."

        );
    }

}
