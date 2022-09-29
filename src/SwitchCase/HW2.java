package SwitchCase;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner country = new Scanner(System.in);
		System.out.println("Please enter your country");
		String language = country.nextLine();
		String values;

		if (language.equals("Kazakhstan")) {
			values = "Kazakh";
		}
		if (language.equals("Nicaragua")) {
			values = "Spanish";
		}
		if (language.equals("USA")) {
			values = "English";
		}
		if (language.equals("Ukraine")) {
			values = "Ukrainian";
		} else
			System.out.println("Unknown");

		switch (language) {

		case "Kazakhstan":
			values = "Kazakh";
			break;
		case "Nicaragua":
			values = "Spanish";
			break;
		case "USA":
			values = "English";
			break;
		case "Ukraine":
			values = "Ukrainian";
			break;
		default:
			values = "Unknown";

		}
		System.out.println("You are from " + language + " and your language is " + values);

	}

}
