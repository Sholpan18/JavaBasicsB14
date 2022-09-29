package Loops;

import java.util.Scanner;

public class HWLoops {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 */
		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		System.out.println("---------------------------------");
		
		//Print numbers from 100 to 1
		for (int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		System.out.println("---------------------------------");
		
		//Print even numbers from 20 to 1 (2 ways)
		int b=20;
		while (b>=1) {
			System.out.print(b+" ");
			b-=2;
		}System.out.println("---------------------------------");
		
		int d=20;
		while (d>=1) {
			if (d%2==0) {
			System.out.print(d+" ");}
			d--;}
		
		System.out.println("---------------------------------");
		
		//Print odd numbers between 20 and 50 (2 ways)
		int c=21;
		while (c<=50) {
			System.out.print(c+" ");
			c+=2;
		}System.out.println("---------------------------------");
		int e=20;
		while (e<=50) {
			if(e%2==1) {
				System.out.print(e+" ");
			}e++;
		}System.out.println("---------------------------------");
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner inp=new Scanner (System.in);
		
		for (int a=1; a<=3; a++) {
			System.out.println("Please enter your name");
			String name=inp.nextLine();
			System.out.println("Good morning "+name);
		}System.out.println("---------------------------------");
		
	
	}
}
