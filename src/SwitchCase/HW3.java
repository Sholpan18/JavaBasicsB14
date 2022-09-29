package SwitchCase;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */

		Scanner calculator=new Scanner (System.in);
		System.out.println("Please enter your first number");
		double num1=calculator.nextDouble();
		System.out.println("Please enter your second number");
		double num2=calculator.nextDouble();
		
		System.out.println("Please enter operator +; *; /; -; ");
		char operator=calculator.next().charAt(0);
		double result=0;
		String res;
		
		if (operator =='+') {
			System.out.println("The result is " +(num1+num2));
		}else if (operator =='-') {
			System.out.println("The answer is "+(num1-num2));
		}else if (operator =='*') {
			System.out.println("The result is " +(num1*num2));
		}else if (operator =='/') {
			System.out.println("The result is " +(num1/num2));
		}else {
			System.out.println("Invalid");
		}
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default: 
		res="Unkown";
		}
		System.out.println(result);
	}

}
