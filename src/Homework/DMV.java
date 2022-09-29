package Homework;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
	
	Scanner dmv=new Scanner (System.in);
	System.out.println("What is your age?");
	int age=dmv.nextInt ();
	
	if (age>=18) {
		System.out.println("I can issue a driver license to you.");
	}
	else {
		System.out.println("I can issue a learner permit.");
	}
	
	}

}
