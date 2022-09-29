package Arrays;

public class HWArrays2Animals {

	public static void main(String[] args) {
		
		/*
		 * Create an array of animals and store 5 elements into it.
		 *  Using 2 different loops print all elements from the array.
		 */

		String[] animals ={"dog", "cat", "horse", "elephant", "zebra"};
		
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println(" ");
		
		for (String zoo:animals) {
			System.out.print(zoo+" ");
		}
		
	}

}
