package StringClassClass12;

public class HWSTringReverse {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String word = "Coffee";

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i) + " ");
		}
		System.out.println("-------------------------------");

		char[] charArr = word.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			System.out.print(charArr[i]);
		}

	}

}
