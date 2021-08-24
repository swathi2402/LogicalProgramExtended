package com.brigdelabz.temperatureconvertion;

import java.util.Scanner;

public class TemperatureConvertion {
	public static void main(String[] args) {
		System.out.println("To give input in Celsius, press '1'");
		System.out.println("To give input in Fahrenheit, press '2'");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		System.out.println("Enter the temperature value: ");
		float celsius, fahrenheit;
		
		if (option == 1) {
			celsius = scanner.nextFloat();
			fahrenheit = ((celsius * 9) / 5) + 32;
			System.out.println("Temperature in Fahrenheit is: " + fahrenheit + "F");
		}
		
		if (option == 2) {
			fahrenheit = scanner.nextFloat();
			celsius = (fahrenheit - 32) * 5/9;
			System.out.println("Temperature in Celsius is: " + celsius + "C");
		}
		scanner.close();
	}
}
