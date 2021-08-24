package com.brigdelabz.decimaltobinary;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimalNumber = 5;
		int[] binaryArray = new int[32];

		int index = 0;
		while (decimalNumber > 0) {
			binaryArray[index] = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
			index++;
		}

		for (int j = index - 1; j >= 0; j--) {
			System.out.print(binaryArray[j]);
		}
	}
}
