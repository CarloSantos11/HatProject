package com.devnom;

import com.devnom.model.CowboyHat;
import com.devnom.model.IHat;
import com.devnom.model.Inventory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IHat hatToWorkWith = new CowboyHat("Red");
//        System.out.println(hatToWorkWith);

        IHat hatToWorkWith1 = new CowboyHat("Red");
//        System.out.println(hatToWorkWith1);

        IHat hatToWorkWith2 = new CowboyHat("Purple");
//        System.out.println(hatToWorkWith2);

//        public Inventory(String hatCategory) {
        Inventory<CowboyHat> cowboyHats = new Inventory<>("Cowboy Hat");

        cowboyHats.addToInventory((CowboyHat) hatToWorkWith);
        cowboyHats.addToInventory((CowboyHat) hatToWorkWith1);
        cowboyHats.addToInventory((CowboyHat) hatToWorkWith2);

        System.out.println(cowboyHats);
    }
}
