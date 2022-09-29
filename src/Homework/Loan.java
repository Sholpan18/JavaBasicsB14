package Homework;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 *  If loan is less or equal to 200,000 then you would lend the money otherwise 
		 *  you would reject the client.
		 */
		
		Scanner loan=new Scanner (System.in);
		
		System.out.println("What is the amount of a loan do you need?");
		double amount=loan.nextDouble();
		
		if (amount<=200000) {
			System.out.println("We will lend that amount!");
		}
		else 
			System.out.println("Sorry, we cannot lend that amount");
		
	}

}
