package com.pairprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initialise the vm

        Scanner in = new Scanner(System.in);

        while(true) {
            // vm to display it's inventory
            String input = in.nextLine(); // select item e.g. COKE
            // vm to prompt to insert coin until sufficient amount
            input = in.nextLine(); // insert coin e.g. 10
            // vm to prompt for option to cancel/refund or dispense item and change
            input = in.nextLine(); // e.g. yes / no
            // vm display item, and change
        }
    }
}
