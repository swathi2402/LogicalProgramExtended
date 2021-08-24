package com.brigdelabz.sqrt;

public class NewtonSquareRoot {
	public static void main(String[] args) {
		double number = 5;
		double epsilon = 1e-15;

		if (number >= 0) {
			double temp = number;
			while (Math.abs(temp - number / temp) > epsilon * temp) {
				temp = (number / temp + temp) / 2.0;
			}
			System.out.println(temp);
		}
	}
}
