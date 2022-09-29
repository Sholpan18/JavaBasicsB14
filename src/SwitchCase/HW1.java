package SwitchCase;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) 
		 * and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, 
		 * any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your grade");
	char grade=scan.next().charAt(0);
	String explain;
	
	if (grade =='A') {
		explain="Excellent";
	}
	if (grade=='B') {
		explain="Good";
	}
	if (grade=='C') {
		explain="Average";
	}if (grade=='D') {
		explain="Bad";
	}
	
	
	switch (grade) {
	case 'A':
		explain="Excellent";
		break;
	case 'B':
		explain="Good";
		break;
	case 'C':
		explain="Average";
				break;
	case 'D':
		explain="Bad";
		break;
	default:
		explain="Not Acceptable";
	
	}
	System.out.println("Your gade is "+grade+", which is " +explain);
	
	
	
	
	
	}

}
