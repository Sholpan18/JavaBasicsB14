package StringClassClass12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 365758768 %$^&^*&( hjkhgh HGJHFGGHFKJ";
		/*
		 * 
		 */
		System.out.println(str.replace("good", "Excellent"));
		System.out.println(str.replaceAll("[a-z]", "")); // replacing all lower case w nothing )

	}

}
