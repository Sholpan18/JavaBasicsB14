package Arrays;

public class HWArrays5ReverseOrder {

	public static void main(String[] args) {
		/*
		 * Create an array to store char values and 
		 * then print those in reverse order
		 */

		
		char[] letters= {'E','D','C','B','A'};
		
		for (int i=letters.length-1; i>=0; i--) {
			System.out.print(letters[i]+" ");
		}
		
	}

}
