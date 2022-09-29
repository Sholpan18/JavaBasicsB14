package Arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int[]array=new int[4];
		// store elements inside an array

        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;

        // accessing elements from the array
        System.out.println(array[2]);

        System.out.println(array[1]+array[2]);

        //Lets create an array and store your classmates

        String[] names=new String[5];
        names[0]="Shah";
        names[1]="Vera";
        names[2]="Roman";
        names[3]="Guljan";
        names[4]="Zamanhullah";

        System.out.println("Hello " +names[1]);

	}

	public static char[] toString(String[] dresses) {
		// TODO Auto-generated method stub
		return null;
	}

}
