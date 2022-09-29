package Loops;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String answer;
		
		System.out.println("Did yo get a job?");
		answer=sc.nextLine();
		while(!answer.equals("yes")) {
			// we need the condition first
			System.out.println("Did yo get a job?");	// answer will be coming out because its't captured 
			// we need the condition first the capture
			answer=sc.nextLine();// capture(answer)
		}
		
	}

}
