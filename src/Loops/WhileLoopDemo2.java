package Loops;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		//print all numbers 1 to 10

		int num=1;
		
		while (num<=10) {
			System.out.print(num+" ");
			num++;
		}
		//print all numbers from 10 to 25
		
		int a=10;
		
		while(a<=25) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("__________________________");
		
		// print all numbers from 10 to 1
		int b=10;
		while (b>=1) {
			System.out.print(b+" ");
			b--;}
		
			System.out.println("__________________________");
			
		// print all numbers from 50 to 20
			int c=50;
			while (c>=20) {
				System.out.print(c+" ");
				c--;
			}	System.out.println("__________________________");
			
			
			
		// print all even numbers from 1 to 20 
			int v=2;
			while (v<=20) {
				System.out.print(v+" ");
				v+=2;
				}
			System.out.print("Another way ");
			int n=1;
			while (n<=20) {
				if (n%2==0) {
				System.out.print(n+" ");
				
				}n++;
				}
			
			
	}

}
