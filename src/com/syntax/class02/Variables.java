package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sholpan";
		String maidden="Mendoza";
		String grade= "A";
		String city="Miami";
		String state="Florida";
		String phone="347 000 xxxx";
				
		System.out.println("My name is "+ name+ "and my last name is "+maidden);
		System.out.println("I am "+grade+ " student ");
		System.out.println("I live in "+ city+ " and state "+state);
		System.out.println("My phone number is " +phone);
		
		
		city="New York";
		state= "New York";
		phone= "6723823849";
		grade= "B ";
		
		System.out.println("My name is "+ name+ "and my last name is "+maidden);
		System.out.println("I am "+grade+ " student ");
		System.out.println("I live in "+ city+ " and state "+state);
		System.out.println("My phone number is " +phone);
		
		//Rules for Identifiers=name (variables, classes, methods)
		// 1. cannot use keywords as identifiers
		// String new ="Hello"; ->error 
		
		//2. cannot have spaces in identifiers 
		//String last name ="Smith"; ->lastname
		String lastname= "Smith";
		
		//3. identifiers cannot start with numbers
		// int 1number=123;  -> error
		int number1=123;
		
		/* 4. identifiers cannot contain any special characters 
		 * exept $ or _
		 */
		
		double $price=9.98;
		float _price1=1.99F;
		
		/*
		 * Naming Conventions
		 * 
		 * Class should start with Upper case and  follow camel casing
		 * 
		 * variables should start with lower case and follow camel casing 
		 */
		
		String Weather="hot";
		
		String myWeather="cold";
	}

}
