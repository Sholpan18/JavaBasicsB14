package Loops;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=1; i<3; i++){ //-->outer loop
			System.out.println ("Hello");  // will executed 2 times
				for (int j=1; j<=3; j++){ //-->nested loop
					System.out.println("Bye");}
			}
		System.out.println("----------------------");
		
		for (int i=0; i<=2; i++) {
			for (int j=1; j<4;j++) {
				System.out.println(i+" "+j);
			}
		}
		
		
	}

}
