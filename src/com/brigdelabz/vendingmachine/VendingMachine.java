package com.brigdelabz.vendingmachine;

public class VendingMachine {

	public static void main(String[] args) {
		int amount = 2547;
		int[] changeCounter = new int[8];
		int[] possiblevalues = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
		int count = 0;
		
		for (int i = 0; i < 8; i++) {
            if (amount >= possiblevalues[i]) {
            	changeCounter[i] = amount / possiblevalues[i];
                amount = amount - changeCounter[i] * possiblevalues[i];
            }
        }
      
        System.out.println("possible value and its note count");
        for (int i = 0; i < 8; i++) {
            if (changeCounter[i] != 0) {
            	count += changeCounter[i];
                System.out.println(possiblevalues[i] + " : " + changeCounter[i]);
            }
        }
        System.out.println("Total number of note count: " + count);
	}

}
 
