package com.pairprogramming;

import com.pairprogramming.vendingmachine.VendingMachine;
import com.pairprogramming.vendingmachine.VendingMachineFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initialise the vm
        
        Scanner in = new Scanner(System.in);

        while(true) {
            try {
                // vm to display it's inventory
                System.out.println(vm.displayMenu());
                String input = in.nextLine(); // select item e.g. COKE
                // vm to prompt to insert coin until sufficient amount
                System.out.println("Please insert " + vm.getPriceByItem(input) + " cents.");
                int balance = vm.insertCoin(in.nextLine()); // insert coin e.g. 10
                while(balance > 0) {
                    System.out.println("Please insert " + balance + " cents or enter R for refund");
                    input = in.nextLine();
                    if(input.equalsIgnoreCase("R")) {
                        System.out.println(vm.refund());
                        return;
                    } else {
                        balance = vm.insertCoin(input);
                    }
                }
                // vm display item, and change
                System.out.println(vm.collectItemAndChange());
                vm.printStats();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
