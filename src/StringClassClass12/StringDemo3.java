package StringClassClass12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str=" i love java";
		System.out.println(str);
		
		System.out.println(str.trim());
		//removes the space before and after the string but not the ones between 

		String str2="Java is Very easy";
		/*
		 * sratsWith->checks if a String starts with a specific letter or word
		 * endsWith->checks if a String ends with a specific letter or word
		 * contains->checks if a String contains with a specific letter or word
		 */
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		System.out.println(str2.contains("very"));
		/*
		 * Method changing  helps us call multiple methods on a single line one method after another
		 */
		System.out.println(str2.toLowerCase().contains("very"));
		
		
	}

}
