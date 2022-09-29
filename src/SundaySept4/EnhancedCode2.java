package SundaySept4;

import java.util.Scanner;

public class EnhancedCode2 {

	public static void main(String[] args) {
		
		
		Scanner year=new Scanner (System.in);
		System.out.println("Please enter your birth month");
		 String month=year.nextLine();
		 String monthOfBirth;
		 if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("january")|| month.equalsIgnoreCase("February")) {
			 monthOfBirth="Winter";
		 }else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) {
			 monthOfBirth="Spring";
		 }else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
			 monthOfBirth="Summer";
		 }else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November")) {
			 monthOfBirth="Fall";
		 }else {monthOfBirth="Invalid";
		 }
		 
System.out.println(monthOfBirth);
	}

}
