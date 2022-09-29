package Loops;

import java.util.Scanner;

public class TaskContinue {

	public static void main(String[] args) {
		// print numbers from 1 to 50 except that are divisible by 3

		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}System.out.print(i+" ");}
		
		System.out.println("--------------------------");
		/*
		 * Write a program to ask a user to enter item they want 
		 * to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell 
		 * the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever user done with payments program should say "
		 * Thank you for shopping!"
		 */
		
		 Scanner input = new Scanner(System.in);
	        System.out.println("What do you want to buy?");
	        String item = input.nextLine();

	        System.out.println("What is the price of the item?");
	        double price = input.nextDouble();

	        double money;
	        double total = 0;
	        System.out.println("Please pay for your " + item);

	        do {

	            money = input.nextDouble();

	            total += money; // accumulate all money
	            double need;
	            double change;

	            if (total < price) {
	                need = price - total;
	                System.out.println("You need to pay more $" + need);
	            } else if (total >= price) {
	                change = total - price;
	                System.out.println("Here is your change " + change);
	                break;
	            }

	        } while (total != price);

	        System.out.println("Thank you for shopping");
		
	}

}
