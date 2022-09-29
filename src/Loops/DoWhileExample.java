package Loops;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String answer;
			
		do {
		System.out.println("Did you get a job?");
		answer=sc.next();
		}while (!answer.equalsIgnoreCase("yes"));
		System.out.println("Congrats!");
		
	}

}
