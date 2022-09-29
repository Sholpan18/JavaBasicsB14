package Arrays;
import java.util.Arrays;
public class ArrayDemo2 {

	public static void main(String[] args) {
		String [] dresses=new String [] {"Pink dress", "cocktail", "Summer Dress",
				"Night dress", "Pencil dress"};
		//last index is always size-1
		//because arrays start from zero
		
		System.out.println(dresses.length);
		
		
		for (int i=0; i<dresses.length; i++) {
			System.out.println("Lets try "+dresses[i]);
		}
		//enhanced for loop
		for (String dress:dresses) {
			System.out.println(dress);
		}
		
		//prints all the elements of an array without a loop
		System.out.println(Arrays.toString(dresses));
		
	}

}
