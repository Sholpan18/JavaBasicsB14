package Homework;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years 
		 * and annual salary. If user worked for more or equals to 5 years 
		 * than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000,
		 *  otherwise bonus=3000.
		 */
		
		Scanner work=new Scanner (System.in);
		System.out.println("How long have you been working in this company?");
		double years=work.nextDouble();
		if(years>=5) {
			System.out.println("You are eligible for a bonus!");
			System.out.println("What is your current salary?");
			double salary=work.nextDouble();
			if (salary>=50000) {
				System.out.println("Your bonus is $5000");}
			else {
				System.out.println("Your bonus is $3000");
			}
			
			}
		else {
			System.out.println("Sorry, you are not eligible for a bonus");
		}
		
		}
	
	 
	
		
	
	
		}

