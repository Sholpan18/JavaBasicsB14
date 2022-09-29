package Loops;

public class ClockHW {

	public static void main(String[] args) {

		for (int h = 0; h <= 2; h++) {

			for (int h1 = 0; h1 <= 10; h1++) {

				if (h == 2 && h1 == 4) {
					break;
				}
				for (int m = 0; m <= 5; m++) {

					for (int m1 = 0; m1 <= 9; m1++) {

						for (int s = 0; s <= 5; s++) {

							for (int s1 = 0; s1 <= 9; s1++) {

								System.out.println(h + "" + h1 + ":" + m + "" + m1 + ":" + s + "" + s1);
							}
						}
					}
				}
			}
		}

	}

}
