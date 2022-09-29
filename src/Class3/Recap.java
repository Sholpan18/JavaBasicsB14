package Class3;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String concatenation helps us to combine two String together
		 */
String firstName="Mina";
String lastName="Henen";
String fullName=firstName+ " " +lastName;
System.out.println(fullName);

int houseNo=10;
int apartmentNo=5;
String streetName="That street";
String city= "New York";
String country="Usa";
String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
System.out.println(fullAddress);
String incompleteAddress=houseNo+city;
String step1="if we subtract 10 from 5 we get="+10; //results in a String
//it is not defined java does not understand what to do when we ask her to subtract
//a string from a number it complains
//String step2 =step1-5;

System.out.println("if we subtract 10 from 5 we get ="+(10-5));


	}

}
