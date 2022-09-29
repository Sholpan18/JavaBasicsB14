package Homework;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask user to input city and temperature.
		 *  Your program should convert Fahrenheit into celsius and print 
		 *  “The temperature is the city  is ”
		 */
		
		Scanner temp=new Scanner (System.in);
		System.out.println("Which city do live in?");
		String city=temp.nextLine();
		System.out.println("What is the current temperature there?");
		double f=temp.nextDouble();
		float celsius=(float)(f-32)*5/9;
		System.out.println("The temperature in "+city+ " is "+celsius+" ˚C");
		
		
	}

}
