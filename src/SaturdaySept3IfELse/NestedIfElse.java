package SaturdaySept3IfELse;

public class NestedIfElse {

	public static void main(String[] args) {

		boolean allergy = true;

		String allergyType = "poLLen";

		if (allergy) {
			System.out.println("Lets check what allergy you have");
			if (allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy producrs");
			} else {
				System.out.println("We need to do some test");
			}
		} else {
			System.out.println("You are lucky");
		}
	}

}
