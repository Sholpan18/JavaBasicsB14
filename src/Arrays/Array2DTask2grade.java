package Arrays;

public class Array2DTask2grade {

	public static void main(String[] args) {
		
		String[][] arr= {

                {"Yusuf", "Hamza", "Adam", "John"},
                {"A", "B", "C", "D"}
        };
		
		for (int i=0; i<arr.length; i++) { 
			
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		} System.out.println("--------------");
		
		for (String[] singleArray:arr) {//enhanced array
			for (String element:singleArray) {// loops over each element of the 1dArray
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		
        System.out.println(arr[0][0]+"="+arr[1][0]);
        System.out.println(arr[0][1]+"="+arr[1][1]);
        System.out.println(arr[0][2]+"="+arr[1][2]);
        System.out.println(arr[0][3]+"="+arr[1][3]);
}

	

}
