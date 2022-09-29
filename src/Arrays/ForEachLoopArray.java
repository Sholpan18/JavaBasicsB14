package Arrays;

public class ForEachLoopArray {

	public static void main(String[] args) {
		// only when we deal with arrays or collections
		// we can use for each loop, enhanced for loop, advanced for loop
		
		String[] iceCream= {"vanilla", "chocolate", "pistashio", "kulfi"};
		
		for (String flavor:iceCream) {
			
			System.out.println(flavor);	
		}
		System.out.println("---------------------------------");
		
		char [] letters= {'A','B','C','D','C'};
		for (char letter:letters) {}
		
		
	}

}
