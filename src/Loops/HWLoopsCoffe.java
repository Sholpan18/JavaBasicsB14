package Loops;

import java.util.Scanner;

public class HWLoopsCoffe {

	public static void main(String[] args) {
		/*
		 *  Declare a variable to store a price for a coffee. 
		 *  Ask the user to pay for a coffee. Keep asking to pay for coffee until the user enters the EXACT amount . 
		 *  If the user gives more than coffee price --> ask them to give less, 
		 *  if the user gives less money then ask to give more. Once user give EXACT amount print “Please enjoy your coffee
		 */

		
	double price=7;
	double answer;
	Scanner inp=new Scanner (System.in);
	System.out.println("Your total is $7");
	
	do {
	answer=inp.nextDouble();
	
		if (price>answer) {
		System.out.println("You gave me less than $7");}
		
		else if (price<answer) {
		System.out.println("You gave me more than $7");}
	}
		while(price!=answer);
	{System.out.println("Enjoy your coffee");}
		
	
	
	}
}
