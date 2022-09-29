package SundaySept4;

import java.util.Scanner;

public class LogicGrade {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 * 
		 */
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		double quiz = inp.nextDouble();
		System.out.println("Please enter your mid term score");
		double midTerm = inp.nextDouble();
		System.out.println("Please enter your final score");
		double finalScore = inp.nextDouble();
		double average = (quiz + midTerm + finalScore) / 3;
		String grade;
		if (average >= 90) {
			grade = "Your grade is A";
		} else if (average >= 70 && average < 90) {
			grade = "Your grade is B";
		} else if (average >= 50 && average < 70) {
			grade = "Your grade is C";
		} else if (average < 50 && average > 0) {
			grade = "Your grade is F";
		} else {
			System.out.println("Please enter valid scores");
			grade = "Invalid";
		}
		System.out.println(grade);
	}

}
