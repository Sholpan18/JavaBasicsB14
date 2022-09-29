package SwitchCase;

public class SwitchDemo2 {

	public static void main(String[] args) {
	// matching cases must of same data type as a variable in switch
	// no duplicated cases in switch
	/*
	 *  Limitations of Switch Cases -> 
	 *  cannot use logical operators; 
	 *  cannot use relational operators;
	 *  Cannot work with boolean value
	 *  Cannot work with float, double and long
	 */
	
char choice='Y';
	String answer;
	
	
	switch(choice) {
	
	case 'Y':
		answer="Yes";
		break;
	case 'N':
		answer="No";
		break;
	case 'M':
		answer="Maybe";
	default:
		answer="Unknown";
		break;
	}
	System.out.println(answer);	
		
		
	}

}
