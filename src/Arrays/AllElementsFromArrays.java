package Arrays;

public class AllElementsFromArrays {

	public static void main(String[] args) {
		
		String[] iceCream= {"vanilla", "chocolate", "pistashio", "kulfi", "mango"};

        System.out.println(iceCream[0]);
        System.out.println(iceCream[1]);

        //how to get all values?

        for(int i=0; i<iceCream.length; i++) {

            System.out.println(iceCream[i]);
        }
        System.out.println("---------------------");
char [] letters= {'A','B','C','D','C'};

	for(int i=0; i<letters.length;i++) {	
		System.out.print(letters[i]+"  ");
	System.out.println("---------------------");

	int[] numbers= {12, 56, 345, 1, 0,9};
	//get all elements using regular for loop
	for (int c=0; c<numbers.length; c++) {
		System.out.print(numbers[c]+" ");
	}
	System.out.println();
	// get all values using enhanced for loop
	// this loop always ONLY 1 way: from start till end
	
	for (int num:numbers) {
		System.out.print(num+" ");
	}
	
	
	}

}
}
