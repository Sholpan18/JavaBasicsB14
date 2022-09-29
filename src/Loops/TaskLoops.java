package Loops;

import java.util.Scanner;

public class TaskLoops {

	public static void main(String[] args) {
		// from the range of 1 to 50 please find the sum of all even and all odd #'s
		
		int sumOdd=0;
		int sumEven=0;
		
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}System.out.println("Sum of odd numbers= "+sumOdd);
		System.out.println("Sum of even numbers= "+sumEven);

		/*
		 * create a secret number and let user guess the secret number
		 * once user guessed secret #-> program says you won!
		 */
		
		double sn=11;
		double answer;
		
	Scanner out=new Scanner (System.in);
	
		
	do {
		System.out.println("Guess my number?");
		answer=out.nextDouble();
		
	} while (answer!=sn);
		System.out.println("You won!");
	}

}
