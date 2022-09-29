package Arrays;

public class HWArray1Cars {
	
	public static void main (String[]args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		String [] cars= {"BMW","Mercedes", "Jeep","Toyota","Audi","Lincoln"};
		
		for (int i=0; i<cars.length; i++) {
		
		System.out.print(cars[i]+" ");}
		
		System.out.println(" ");
		
		for (String car:cars) {
		System.out.print(car+" ");}
	}

}
