package Homework;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 * otherwise user will consider buying. Once user decides to buy a house, 
		 * if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash
		 */
		
		double r=3.2;
		int p=700000;
		
		Scanner rate=new Scanner (System.in);
		System.out.println("Please enter a mortgage rate.");
		
		double MortgageRate=rate.nextDouble();
		
		if (MortgageRate>=4.5) {
			System.out.println("We will not buy a house. The rate is too high");
			
		}
		else {
			System.out.println("We will buy a house!");
			System.out.println("How much is the mortgage price?");
			int MortgagePrice=rate.nextInt();
			
			if (MortgagePrice>=200000) {
				System.out.println("We'll take a loan");
			}
			else {
				System.out.println("We'll pay cash");
			}
		}
		
		
		
	}

}
