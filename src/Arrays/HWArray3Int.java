package Arrays;

public class HWArray3Int {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of 
		 * all elements in an array
		 */
		
		int[] nums= {4, 45, 56, 243, 254, 32, 343, 23,};
		
		int sum=0;
		
		for (int i:nums){
		sum+=i;
		}
		System.out.println("The sum of all elements in an array "+sum);
		
		
	}

}
