package StringClassClass12;

public class HWMiddle3Character {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */

		String name = "Chair";
		int length = name.length();
		if (!name.isEmpty() && length % 2 != 0 && length >= 3) {
			int middleIndex = length / 2;
			System.out.println(name.charAt(middleIndex));
		}

	}

}
