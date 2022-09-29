package Arrays;

public class Task1Array {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */

		String[] grade= {"A","B","C","D","E","F"};
		System.out.println(grade[1]);
		
		String[] grad=new String[6];
		grad[0]="A";
		grad[1]="B";
		grad[2]="C";
		grad[3]="D";
		grad[4]="E";
		grad[5]="F";
		System.out.println(grad[1]);
		
		System.out.println("--------------------------------");
		
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		
		String[]names= {"John","Sean","Emma","Alice","Cooper"};
		System.out.println(names[1]);
	
		String[] name=new String[5];
		name[0]="John";
		name[1]="Sean";
		name[2]="Emma";
		name[3]="Alice";
		name[4]="Eooper";

		System.out.println(name[1]);
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.
		 */
		String[]words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		String[] word=new String[5];
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
		
	} 


}
