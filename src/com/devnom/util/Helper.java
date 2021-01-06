package com.devnom.util;

import java.util.Scanner;

public final class Helper {
    public static final String getUserInput(){
        // could be number or string. Casting may be necessary
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        input.trim();
        return input;
    }
}
