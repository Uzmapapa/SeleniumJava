package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,7,8};
		 Arrays.sort(array);
		 for (int i = 0; i < array.length; i++) {
			 
			 System.out.print(array[i] + "  ");
			 	 if(array[i] != i+1) {
			 	 System.out.println();
			 	 System.out.print ("The missing number in the array is :" + (i + 1));
				 break;
				 
			 }
		}
		
	}

}
