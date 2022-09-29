package StringClassClass12;

import java.util.Scanner;

public class HWBabyName {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is the mom's name?");
		String momname = scan.nextLine();
		System.out.println("What is the dad's name?");
		String dadname = scan.nextLine();
		System.out.println("What is the gender of the baby?");
		String gender = scan.nextLine();
		String firstHalf;
		String secondHalf;

		if (gender.equals("boy")) {
			firstHalf = dadname.substring(0, dadname.length() / 2);
			secondHalf = momname.substring(momname.length() / 2);

		} else {
			firstHalf = momname.substring(0, momname.length() / 2);
			secondHalf = dadname.substring(dadname.length() / 2);

		}
		System.out.println(firstHalf + secondHalf);
	

	System.out.println("-------------------------------------------");

	String motherName = "Mary";
	String fatherName = "Daniel";
	boolean isBoy = false;

	if(isBoy)
	{
		String firstHalf1 = fatherName.substring(0, fatherName.length() / 2);
		String secondHalf2 = motherName.substring(motherName.length() / 2);
		System.out.println(firstHalf1 + secondHalf2);

	}else
	{
		String firstHalf1 = motherName.substring(0, motherName.length() / 2);
		String secondHalf2 = fatherName.substring(fatherName.length() / 2);
		System.out.println(firstHalf1 + secondHalf2);

	}

}

}
