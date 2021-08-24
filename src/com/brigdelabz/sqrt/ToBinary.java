package com.brigdelabz.sqrt;

public class ToBinary {
	public static void main(String[] args) {
		int decimalNumber = 17;
		int swapNibbles = ((decimalNumber & 0x0F) << 4 | (decimalNumber & 0xF0) >> 4);
		System.out.println(swapNibbles);		

		while (swapNibbles % 2 == 0) {
			swapNibbles = swapNibbles / 2;
		}
		if (swapNibbles == 1) {
			System.out.println("The given number is power of 2");
		} 
		else {
			System.out.println("The given number is not power of 2");
		}
	}
}
