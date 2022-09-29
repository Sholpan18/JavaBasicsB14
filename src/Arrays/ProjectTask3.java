package Arrays;

public class ProjectTask3 {

	public static void main(String[] args) {
		/*
		 *  Create a 2D array of integer values. Print the sum of
		 *  all numbers.
		 */

		int[][] arr= {
				{34, 35,7, 46, 34, 38, 93, 73},
				{11, 544,76, 96, 267, 16, 46}
		};
		
		int sum=0;
		for (int[]i:arr) {
		for(int num:i){
		sum+=num;
		}}
		System.out.println(sum);
		  
		System.out.println("********even numbers**********");
		
		for (int[] ar : arr) {

	            for (int num : ar) {
	                if(num%2==0) {
	                    System.out.println(num);
	                }

	            }
	}

}
}