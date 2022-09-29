package Loops;

public class LoopsExample {

	public static void main(String[] args) {
		// Print numbers from 100 to 1
		
		
		
		
		
		int a=100;
		while (a>=1){
			System.out.print(a+" ");
			a--;}
		// Print even numbers from 30 to 100 
		System.out.println("--------------------------");
		
		int b=30;
		while (b<=100) {
			System.out.print(b+" ");
			b+=2;
		}
		// Print only odd numbers from 100 to 1 (2 different ways)
		System.out.println("--------------------------");
		
		int c=99;
		while (c>=1) {
			System.out.print(c+" ");
			c-=2;
		}
		System.out.println("--------------------------");
		
		int d=100;
		while (d<=1) {
			if (d%3==0) {
			System.out.print(d+" ");
			
			}d++;
			}
	}

}
