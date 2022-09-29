package SundaySept4;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		

		Scanner num=new Scanner (System.in);
		System.out.println("Can you please write current time?");
		double time=num.nextDouble();
		
		String timeOfTheDay;
		
		if (time>=1 && time<=11) {
			timeOfTheDay="Morning";
		} else if (time>=12 && time<=15) {
			timeOfTheDay="Afternon";
		}else if (time>=16 && time<=20) {
			timeOfTheDay="Evening";
		}else if (time>=21 && time<=24) {
			timeOfTheDay="Night";
		}else {
			System.out.println("Number is not valid");
			timeOfTheDay="Invalid";
		}
		System.out.println(timeOfTheDay);
		
		

	}

}
