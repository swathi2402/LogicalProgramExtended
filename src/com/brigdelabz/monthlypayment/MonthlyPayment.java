package com.brigdelabz.monthlypayment;

public class MonthlyPayment {

	public static void main(String[] args) {
		int principal = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int interest = Integer.parseInt(args[2]);

		int totalMonth = 12 * year;
		double persentRate = (double) interest / (12 * 100);
		double payment = (principal * persentRate) / (1 - Math.pow((1 + persentRate), (-totalMonth)));
		System.out.println("Monthly payments that has to be made over " + year + " years is: " + payment);
	}
}
