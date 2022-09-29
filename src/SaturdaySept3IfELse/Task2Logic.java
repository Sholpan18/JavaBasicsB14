package SaturdaySept3IfELse;

import java.util.Scanner;

public class Task2Logic {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 */

		Scanner day=new Scanner (System.in);
		System.out.println("Please enter number of the day");
		int inp=day.nextInt();
		if (inp>1 && inp<=5) {
			System.out.println("Weekday");
		}else if (inp==6 || inp==7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid number");
		}
		
		
	}

}
