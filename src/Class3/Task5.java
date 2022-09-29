package Class3;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to check whether number is positive or negative
		 */
int number=0;

if(number>0) {
System.out.println("Number is Positive");

}else if (number<0) {
	System.out.println("Number is Negative");
}else {
	System.out.println("Number is neither positive or negative");
}

boolean isInterview = false;
String hrRound = "Fail";
String TechRound = "Pass";

if(isInterview) {
    if(hrRound.equals("Pass")) {
        if(TechRound.equals("Pass")) {
            System.out.println("Congratulation you got the job!");
        }else {
            System.out.println("Good luck for next time");
        }
    }else {
        System.out.println("Unfortunately you are not selected for this role.");
    }
}else {
    System.out.println("Keep hunting for the Job!");
}



	}

}
