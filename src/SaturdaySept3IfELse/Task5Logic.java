package SaturdaySept3IfELse;

import java.util.Scanner;

public class Task5Logic {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =”Spring” if user is born in June, July, August → season =”Summer” etc …
		 */
 Scanner year=new Scanner (System.in);
 System.out.println("Please enter your birth month");
 String month=year.nextLine();
 if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("january")|| month.equalsIgnoreCase("February")) {
	 System.out.println("Winter");
 }else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) {
	 System.out.println("Spring");
 }else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
	 System.out.println("Summer");
 }else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November")) {
	 System.out.println("Fall");
 }
 
	}

}
