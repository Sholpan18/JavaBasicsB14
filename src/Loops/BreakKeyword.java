package Loops;

public class BreakKeyword {

	public static void main(String[] args) {
		
		for (int i=1; i<5; i++) {
			System.out.println("Hello");
			if(i==3) {
			break;}
		}
		// break - breaks the loop and it usually used inside some type of conditions
		
		boolean hungry=true;
		while(hungry) {
			System.out.println("Give me food");
			break;
		}
		
		System.out.println("End");
	}

}