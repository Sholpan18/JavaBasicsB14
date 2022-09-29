package Arrays;

public class HWArray4LargestNumber {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 */
		
		int[] num= {23, 45, 87, 34,83, 91, 12};
		int largest=0;
		
		for (int i=0; i<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println("The largest number is "+largest);
		
	}

}
