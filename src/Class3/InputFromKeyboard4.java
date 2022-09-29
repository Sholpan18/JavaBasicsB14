package Class3;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve any Repl Assignments. Please True or False");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if (solvedAnyRepls) {
			System.out.println("How many Repls you solved");
			int noOfReplsSolved=scanner.nextInt();
			
			if(noOfReplsSolved>=17)
		{
				System.out.println("you are doing great");}
			else if (noOfReplsSolved>10) {
				System.out.println("You are doing ok. Please complete them as soon as possible");
			}else {
				System.out.println("You should solve some Repls");
			}
			}
		else {
		System.out.println("They are very importantto learn java please solve them");	
		}
		
		
		
	}

}
